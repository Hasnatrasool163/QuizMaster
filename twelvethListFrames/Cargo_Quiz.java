package twelvethListFrames;

import frame.Quiz;
import java.awt.event.ActionEvent;

/**
 * @author MuhammadHasnatRasool
 */
public class Cargo_Quiz extends Quiz {
    
    public Cargo_Quiz(String name) {
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
    
    // questions:19
    @Override
    public final void loadQuestions() {
        
        questions.add("What is Cargo?");
        options.add("A) A package manager for macOS, B) A package manager for Linux, C) A package manager for Rust, D) A version control system");
        answers.add("C) A package manager for Rust");
        
        questions.add("Which command is used to create a new Rust project with Cargo?");
        options.add("A) cargo create <project-name>, B) cargo new <project-name>, C) cargo init <project-name>, D) cargo build <project-name>");
        answers.add("B) cargo new <project-name>");
        
        questions.add("How do you build a Rust project with Cargo?");
        options.add("A) cargo make, B) cargo build, C) cargo compile, D) cargo run");
        answers.add("B) cargo build");
        
        questions.add("Which command is used to run a Rust project with Cargo?");
        options.add("A) cargo execute, B) cargo start, C) cargo run, D) cargo run-project");
        answers.add("C) cargo run");
        
        questions.add("How do you create a new binary executable project with Cargo?");
        options.add("A) cargo new --bin <project-name>, B) cargo create --bin <project-name>, C) cargo init --bin <project-name>, D) cargo build --bin <project-name>");
        answers.add("A) cargo new --bin <project-name>");
        
        questions.add("What does 'cargo build' command do in Cargo?");
        options.add("A) Downloads dependencies, B) Compiles the project, C) Runs tests, D) Installs the project");
        answers.add("B) Compiles the project");
        
        questions.add("How do you create a new library project with Cargo?");
        options.add("A) cargo new --lib <project-name>, B) cargo create --lib <project-name>, C) cargo init --lib <project-name>, D) cargo build --lib <project-name>");
        answers.add("A) cargo new --lib <project-name>");
        
        questions.add("What does 'cargo run' command do in Cargo?");
        options.add("A) Builds and installs the project, B) Compiles and executes the project, C) Runs tests, D) Runs benchmarks");
        answers.add("B) Compiles and executes the project");
        
        questions.add("Which command is used to update dependencies in a Cargo project?");
        options.add("A) cargo upgrade, B) cargo update,");
        answers.add("B) cargo update");
        
        questions.add("How do you build a specific package in a Cargo workspace?");
        options.add("A) cargo build <package-name>, B) cargo workspace build <package-name>, C) cargo make <package-name>, D) cargo build --package <package-name>");
        answers.add("D) cargo build --package <package-name>");
        
        questions.add("What is the purpose of 'cargo check' command in Cargo?");
        options.add("A) Builds the project and its dependencies, B) Checks the syntax of the project, C) Checks for outdated dependencies, D) Runs tests");
        answers.add("B) Checks the syntax of the project");
        
        questions.add("How do you add a specific version of a dependency to a Cargo project?");
        options.add("A) Update Cargo.toml manually, B) cargo add <dependency> --version <version>, C) cargo install <dependency> --version <version>, D) cargo update <dependency> --version <version>");
        answers.add("B) cargo add <dependency> --version <version>");
        
        questions.add("Which command is used to view detailed information about a dependency in a Cargo project?");
        options.add("A) cargo show <dependency>, B) cargo info <dependency>, C) cargo details <dependency>, D) cargo describe <dependency>");
        answers.add("A) cargo show <dependency>");
        
        questions.add("How do you update all dependencies to their latest versions in a Cargo project?");
        options.add("A) cargo upgrade, B) cargo update --all, C) cargo update-all, D) cargo upgrade --all");
        answers.add("B) cargo update --all");
        
        questions.add("What does 'cargo clean --package <package-name>' command do in Cargo?");
        options.add("A) Cleans up target directory for the specified package, B) Cleans up target directory for all packages, C) Removes all installed dependencies, D) Uninstalls the specified package");
        answers.add("A) Cleans up target directory for the specified package");
        
        questions.add("How do you specify a dependency from a Git repository in Cargo?");
        options.add("A) cargo add <dependency> git: '<git-url>', B) cargo add <dependency> --from '<git-url>', C) cargo add <dependency> source: '<git-url>', D) cargo add <dependency> url: '<git-url>'");
        answers.add("C) cargo add <dependency> source: '<git-url>'");
        
        questions.add("Which command is used to publish a crate to crates.io with Cargo?");
        options.add("A) cargo publish, B) cargo push, C) cargo release, D) cargo submit");
        answers.add("A) cargo publish");
        
        questions.add("How do you specify a dependency with features enabled in Cargo?");
        options.add("A) cargo add <dependency> features: ['feature1' 'feature2'], B) cargo add <dependency> --features 'feature1 feature2', C) cargo add <dependency> enable-features: ['feature1' 'feature2'], D) cargo add <dependency> --enable-features 'feature1 feature2'");
        answers.add("A) cargo add <dependency> features: ['feature1' 'feature2']");
        
        questions.add("What is the purpose of 'cargo doc --open' command in Cargo?");
        options.add("A) Generates documentation and opens it in the default browser, B) Opens Cargo documentation, C) Opens project README file, D) Opens Rust documentation");
        answers.add("A) Generates documentation and opens it in the default browser");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[] args) {
        new Cargo_Quiz(name).setVisible(true);
    }
    
}
