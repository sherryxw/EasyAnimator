package cs5004.animator.controller;

import java.io.FileNotFoundException;
import cs5004.animator.view.IView;

/**
 * This is a TextController implements IController interface.
 */
public class TextController implements IController {
  private final IView view;

  /**
   * Construct a textController.
   * @param view the text view
   */
  public TextController(IView view) {
    this.view = view;
  }


  /**
   * Perform an animation using the provided model.
   */
  @Override
  public void animate() throws FileNotFoundException {
    if (view.getViewType().equals("text")) {
      this.view.render();
    }
  }

}
