module com.example.listadellaspesa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.listadellaspesa to javafx.fxml;
    exports com.example.listadellaspesa;
}