import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

/**
 * 
 * Luis Cervantes<br>
 * 10/20/16<br>
 * This Program is a Switch Case exercise wherein the user can choose a role from an array.
 *
 */

	public class SwitchCase extends Application {
      	
		@Override
		public void start(Stage primarystage) {
				
			List<String> choices = new ArrayList<>();
			choices.add("Administrator");
			choices.add("Faculty");
			choices.add("Staff");
			choices.add("Student");
			choices.add("Guest");
																			
			ChoiceDialog<String> dialog = new ChoiceDialog<>(null, choices);
			dialog.setTitle("Login");
			dialog.setHeaderText("Welcome");
			dialog.setContentText("Enter your role: ");
			Optional<String> result = dialog.showAndWait();
																												
			switch (result.get()) {
																																			
			case "Administrator":  case "Faculty": case "Staff": case "Student": case "Guest":
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Login");
				alert.setHeaderText(null);
				alert.setContentText("Welcome " + result.get());
				alert.showAndWait();
				break;				
																																																																		
			default:
				System.exit(0);																																																																											
			}
		}
	public static void main(String[] args) {
		launch(args);
	}
}
