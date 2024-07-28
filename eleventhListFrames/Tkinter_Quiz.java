
package eleventhListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Tkinter_Quiz extends Quiz{
    

    public Tkinter_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }
    
     private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }

    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }


    // questions:28
    @Override
    public final void loadQuestions() {

        questions.add("What is the main builtin module used to create GUI applications in Python?");
        options.add("A) tkinter, B) PyQt, C) wxPython, D) Kivy");
        answers.add("A) tkinter");

        questions.add("What is the name of the Tkinter widget used to display text or images?");
        options.add("A) Label, B) Button, C) Entry, D) Text");
        answers.add("A) Label");

        questions.add("How do you create a Tkinter window?");
        options.add("A) tk.Window(), B) tk.root(), C) tk.Frame(), D) tk.Label()");
        answers.add("B) tk.root()");

        questions.add("What is the purpose of the grid method in Tkinter?");
        options.add("A) To arrange widgets in a grid, B) To arrange widgets in a row, C) To arrange widgets in a column, D) To remove widgets");
        answers.add("A) To arrange widgets in a grid");

        questions.add("Which Tkinter widget is used to get user input?");
        options.add("A) Label, B) Button, C) Entry, D) Text");
        answers.add("C) Entry");

        questions.add("How do you set the title of a Tkinter window?");
        options.add("A) window.title(), B) window.label(), C) window.button(), D) window.entry()");
        answers.add("A) window.title()");

        questions.add("What is the purpose of the pack method in Tkinter?");
        options.add("A) To arrange widgets in a grid, B) To arrange widgets in a row, C) To arrange widgets in a column, D) To remove widgets");
        answers.add("B) To arrange widgets in a row");
        
        questions.add("What is the default layout manager in Tkinter?");
        options.add("A) Pack, B) Grid, C) Place, D) None");
        answers.add("A) Pack");

        questions.add("Which widget is used to display a dialog box?");
        options.add("A) Label, B) Button, C) Entry, D) MessageBox");
        answers.add("D) MessageBox");

        questions.add("How do you create a checkbox in Tkinter?");
        options.add("A) Checkbutton, B) Radiobutton, C) Button, D) Label");
        answers.add("A) Checkbutton");

        questions.add("What is the purpose of the 'text' attribute in a Label widget?");
        options.add("A) To set the font size, B) To set the font color, C) To set the text displayed, D) To set the background color");
        answers.add("C) To set the text displayed");

        questions.add("Which method is used to run the Tkinter event loop?");
        options.add("A) mainloop(), B) run(), C) start(), D) event_loop()");
        answers.add("A) mainloop()");

        questions.add("How do you create a dropdown menu in Tkinter?");
        options.add("A) OptionMenu, B) DropDown, C) ComboBox, D) Menu");
        answers.add("A) OptionMenu");

        questions.add("What is the purpose of the 'command' attribute in a Button widget?");
        options.add("A) To set the button's text, B) To set the button's color, C) To specify a function to call when the button is clicked, D) To set the button's font");
        answers.add("C) To specify a function to call when the button is clicked");
        
        questions.add("Which widget is used to display a scrolling list of items?");
        options.add("A) Listbox, B) Combobox, C) Scrollbar, D) Text");
        answers.add("A) Listbox");

        questions.add("How do you create a radio button in Tkinter?");
        options.add("A) Radiobutton, B) Checkbutton, C) Button, D) Label");
        answers.add("A) Radiobutton");

        questions.add("What is the purpose of the 'variable' attribute in a Checkbutton widget?");
        options.add("A) To set the text of the checkbutton, B) To set the color of the checkbutton, C) To associate a variable with the checkbutton, D) To set the font of the checkbutton");
        answers.add("C) To associate a variable with the checkbutton");

        questions.add("Which method is used to get the value of a Tkinter variable?");
        options.add("A) get(), B) set(), C) value(), D) fetch()");
        answers.add("A) get()");

        questions.add("How do you create a frame in Tkinter?");
        options.add("A) Frame, B) Label, C) Button, D) Entry");
        answers.add("A) Frame");

        questions.add("What is the purpose of the 'bd' attribute in a widget?");
        options.add("A) To set the background color, B) To set the border width, C) To set the font size, D) To set the text color");
        answers.add("B) To set the border width");

        questions.add("Which widget is used to display a dialog box with a message?");
        options.add("A) MessageBox, B) Dialog, C) Message, D) InfoBox");
        answers.add("A) MessageBox");

        questions.add("How do you create a scale widget in Tkinter?");
        options.add("A) Scale, B) Slider, C) Progressbar, D) Gauge");
        answers.add("A) Scale");

        questions.add("What is the purpose of the 'resolution' attribute in a Scale widget?");
        options.add("A) To set the font size, B) To set the color, C) To set the precision of the scale, D) To set the text displayed");
        answers.add("C) To set the precision of the scale");
        
        questions.add("Which method is used to configure a widget's options?");
        options.add("A) config(), B) configure(), C) options(), D) settings()");
        answers.add("B) configure()");

        questions.add("What is the purpose of the 'cursor' attribute in a widget?");
        options.add("A) To set the mouse cursor shape, B) To set the text color, C) To set the background color, D) To set the font size");
        answers.add("A) To set the mouse cursor shape");

        questions.add("Which widget is used to display a graphical icon?");
        options.add("A) Label, B) Button, C) Image, D) Picture");
        answers.add("C) Image");

        questions.add("How do you create a paned window in Tkinter?");
        options.add("A) PanedWindow, B) Frame, C) Label, D) Window");
        answers.add("A) PanedWindow");

        questions.add("What is the purpose of the 'show' attribute in a Menu widget?");
        options.add("A) To show or hide the menu, B) To set the menu's text, C) To set the menu's color, D) To set the menu's font");
        answers.add("A) To show or hide the menu");

    }

    
    public static void main(String[]args){
        new Tkinter_Quiz(name).setVisible(true);
    }
    
}


