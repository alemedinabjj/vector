const form = $('#form');
const priceError = $('#price-error');
const descriptionError = $('#description-error');
const successMessage = $('#success-message');
const priceInput = $('#price');
const descriptionInput = $('#description');

const listProducts = $('#list-products');

const BASE_URL = 'http://localhost:8080';

function clearForm() {
  priceInput.val('');
  descriptionInput.val('');
}

function clearErrors() {
  priceError.text('');
  descriptionError.text('');
}

function displaySuccessMessage() {
  successMessage.text('Produto criado com sucesso!');
  setTimeout(() => {
    successMessage.text('');
  }, 3000);
}

function onSubmit(e) {
  e.preventDefault();

  const price = priceInput.val();
  const description = descriptionInput.val();

  clearErrors();

  if (!price) {
    priceError.text('Campo obrigatório');
    return;
  }

  if (!description) {
    descriptionError.text('Campo obrigatório');
    return;
  }

  const formattedPrice = price.replace(',', '.');

  $.ajax({
    url: `${BASE_URL}/product`,
    method: 'POST',
    data: {
      price: formattedPrice,
      description,
    },
    success: function (response) {
      console.log(response);
      displaySuccessMessage();
      clearForm();
    },
    error: function (error) {
      console.error('Erro ao criar produto', error.responseJSON.message);
    },
  });
}

form.on('submit', onSubmit);
