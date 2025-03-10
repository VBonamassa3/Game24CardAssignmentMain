module org.example.game24cardassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.game24cardassignment to javafx.fxml;
    exports org.example.game24cardassignment;
}