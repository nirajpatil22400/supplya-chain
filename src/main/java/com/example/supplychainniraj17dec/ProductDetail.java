package com.example.supplychainniraj17dec;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ProductDetail {
    public TableView<Product> productTable;

    public Pane getAllProducts(){
        TableColumn id = new TableColumn("Id");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn name = new TableColumn("Name");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn prize = new TableColumn("Prize");
        prize.setCellValueFactory(new PropertyValueFactory<>("prize"));

        ObservableList<Product> data = FXCollections.observableArrayList();
        data.add(new Product(1,"Lenovo",8439));
        data.add(new Product(2,"HP",8590));

        productTable = new TableView<>();
        productTable.setItems(data);
        productTable.getColumns().addAll(id,name,prize);

        Pane tablePane = new Pane();
        tablePane.getChildren().add(productTable);
        return tablePane;
    }
}
