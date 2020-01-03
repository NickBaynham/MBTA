package models;

import org.graphwalker.core.model.Edge;
import org.graphwalker.core.model.Model;
import org.graphwalker.core.model.Vertex;

public class ModelBuilder {
    public static Model buildModel() {

        // create graph nodes
        Vertex vertexStart = new Vertex().setName("Start");
        Vertex vertexWelcomePage = new Vertex().setName("Welcome");
        Vertex vertexOurPassionPage = new Vertex().setName("Our Passion");
        Vertex vertexMenuPage = new Vertex().setName("Menu");
        Vertex vertexLetsTalkTeaPage = new Vertex().setName("Let's Talk Tea");
        Vertex vertexCheckOutPage = new Vertex().setName("Check Out");

        // create edges
        Edge edgeStartBrowser = new Edge()
                .setName("Start Browser")
                .setSourceVertex(vertexStart)
                .setTargetVertex(vertexWelcomePage);

        Edge navigateToOurPassionPage = new Edge()
                .setName("Navigate to Our Passion Page")
                .setSourceVertex(vertexWelcomePage)
                .setTargetVertex(vertexOurPassionPage);

        // Build the Model
        Model model = new Model();
        model.addVertex(vertexStart);
        model.addVertex(vertexWelcomePage);
        model.addVertex(vertexOurPassionPage);
        model.addVertex(vertexMenuPage);
        model.addVertex(vertexLetsTalkTeaPage);
        model.addVertex(vertexCheckOutPage);

        return model;
    }
}
