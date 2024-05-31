package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class dashController {

    @FXML
    private StackedBarChart<?, ?> barChart;

    @FXML
    private TreeTableColumn<?, ?> buyingTable;

    @FXML
    private Button depoButton;

    @FXML
    private TreeTableColumn<?, ?> nominalTable;

    @FXML
    private Label saldo;

    @FXML
    private TreeTableView<?> transaksiTable;

    @FXML
    private void depoMenu() throws IOException {
        App.setRoot("landingPage");
    }

}
