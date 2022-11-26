module com.example.snakeandladder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.snakeandladder to javafx.fxml;
    exports com.example.snakeandladder;
}