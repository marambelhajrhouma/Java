package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PremierFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene1 = new Scene(root, 400, 300, Color.WHITE);

        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setScene(scene1);

        Line ligne = new Line(50, 50, 200, 50);
        root.getChildren().add(ligne);

        Rectangle rectangle = new Rectangle(50, 100, 150, 80);
        rectangle.setFill(Color.BLUE);
        root.getChildren().add(rectangle);

        Circle cercle = new Circle(300, 200, 30);
        cercle.setFill(Color.RED);
        root.getChildren().add(cercle);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene2 = new Scene(grid, 300, 275);
        primaryStage.setScene(scene2);

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        Button exitBtn = new Button("Exit");
        HBox hbExitBtn = new HBox(10);
        hbExitBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbExitBtn.getChildren().add(exitBtn);
        grid.add(hbExitBtn, 0, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
   		 @Override
   		 public void handle(ActionEvent e) {
   			 
   		 actiontarget.setFill(Color.FIREBRICK);
   		 actiontarget.setText("Sign in button pressed");
   		 
   			 String password = pwBox.getText();
   	         
   	         if (password.equals("123")) {
   	             actiontarget.setFill(Color.GREEN);
   	             actiontarget.setText("Sign in successful "+userTextField.getText()+" !");
   	         } else {
   	             actiontarget.setFill(Color.FIREBRICK);
   	             actiontarget.setText("Incorrect password!");
   	         }
   		 }
   		});

        exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Platform.exit();
            }
        });

        primaryStage.show();
    }
public static void main(String[] args) {
        launch(args);
    }
}
