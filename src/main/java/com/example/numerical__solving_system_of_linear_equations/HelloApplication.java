package com.example.numerical__solving_system_of_linear_equations;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.*;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application implements EventHandler<ActionEvent>{
    Button WelcomeButton = new Button("Welcome!");
    Button AfterInputIsTaken = new Button("next!");
    Button AfterMethodIsChosen = new Button("next!");
    Button AfterParametersAreSet = new Button("next!");
    Button AfterIntialGuessIsSet = new Button("next!");
    Button AfterPrecisionIsSet = new Button("next!");
    Button Solve = new Button("solve");

    String methodType = new String(); // G,GJ,GS,J,LU
    ArrayList<Double> input = new ArrayList<Double>();
    Stage st = new Stage();
    @Override
    public void start(Stage stage) throws IOException  {
        WelcomeButton.setText("Hello!");
        WelcomeButton.setOnAction(this);
        StackPane layout = new StackPane();
        layout.getChildren().add(WelcomeButton);
        Scene scene = new Scene(layout, 300, 300);
        st.setScene(scene);
        st.show();
    }
    void inputTaker()
    {
        StackPane layout = new StackPane();
        AfterInputIsTaken.setOnAction(this);

        Node y = new Label("Please insert the equations!");
        layout.getChildren().add(0,y);
        layout.getChildren().add(AfterInputIsTaken);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();

    }

    void methodPicker()
    {
        StackPane layout = new StackPane();
        Node y = new Label("Please insert the method!");
        AfterMethodIsChosen.setOnAction(this);
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterMethodIsChosen);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }

    void needParameterOrNot()
    {
        int type = 0;
        if(type == 1) {
            extraSceneForParameters();
        }
    }

    void extraSceneForParameters()
    {
        StackPane layout = new StackPane();
        Node y = new Label("Please insert parameters");
        AfterParametersAreSet.setOnAction(this);
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterParametersAreSet);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void precisionSetter()
    {
        StackPane layout = new StackPane();
        Node y = new Label("Please insert precision");
        AfterPrecisionIsSet.setOnAction(this);
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterPrecisionIsSet);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void needInitialGuessOrNot()
    {
        int type = 0;
        if(type == 1)
            extraSceneForInitialGuess();
    }
    void extraSceneForInitialGuess()
    {
        StackPane layout = new StackPane();
        Node y = new Label("Please insert initial Guess");
        AfterIntialGuessIsSet.setOnAction(this);
        layout.getChildren().add(0,y);
        layout.getChildren().add(1,AfterIntialGuessIsSet);
        Scene scene1 = new Scene(layout, 300, 300);
        st.setScene(scene1);
        st.show();
    }
    void solve()
    {
        // We'll make object and pass the every thing to it
        // 5 methods will be representing the 5 ways to
        // solve a system of linear Equations
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==WelcomeButton)
        {
            inputTaker();
        }
        else if(actionEvent.getSource()==AfterInputIsTaken)
        {
            methodPicker();
        }
        else if(actionEvent.getSource()==AfterMethodIsChosen)
        {
            needParameterOrNot();
            precisionSetter();
        }
        else if(actionEvent.getSource()==AfterParametersAreSet)
        {
            needInitialGuessOrNot();
            solve();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}