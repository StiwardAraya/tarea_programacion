module cr.ac.una.tarea.tarea_programacion {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.tarea.tarea_programacion to javafx.fxml;
    exports cr.ac.una.tarea.tarea_programacion;
}
