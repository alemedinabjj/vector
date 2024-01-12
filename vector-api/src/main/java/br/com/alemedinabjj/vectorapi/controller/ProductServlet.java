package br.com.alemedinabjj.vectorapi.controller;

import br.com.alemedinabjj.vectorapi.model.Product;
import br.com.alemedinabjj.vectorapi.repository.ProductRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/product")

public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String description = req.getParameter("description");
        Double price = Double.parseDouble(req.getParameter("price"));

        Product product = new Product(UUID.randomUUID(), description, price);

        if (product.hasError()) {
            resp.getWriter().println("Erro ao cadastrar produto!");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        ProductRepository.insertProduct(product);

        resp.getWriter().println("INSERT INTO product (cod, description, price) VALUES ('" + product.getCod() + "', '" + product.getDescription() + "', " + product.getPrice() + ");");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(ProductRepository.getAllProducts());
    }
}
