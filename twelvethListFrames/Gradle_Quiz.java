package twelvethListFrames;

import frame.Quiz;
import java.awt.event.ActionEvent;

/**
 * @author MuhammadHasnatRasool
 */
public class Gradle_Quiz extends Quiz{
    

    public Gradle_Quiz(String name) {
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


    // questions:30
    @Override
    public final void loadQuestions() {
        
      
        questions.add("What is Gradle?");
        options.add("A) A build automation tool, B) A version control system, C) A Java IDE, D) A web framework");
        answers.add("A) A build automation tool");

        questions.add("Which file defines the build configuration in Gradle?");
        options.add("A) build.gradle, B) gradle.properties, C) settings.gradle, D) build.xml");
        answers.add("A) build.gradle");

        questions.add("How do you initialize a new Gradle project?");
        options.add("A) gradle init, B) gradle create, C) gradle new, D) gradle start");
        answers.add("A) gradle init");

        questions.add("Which Gradle command is used to build a project?");
        options.add("A) gradle build, B) gradle compile, C) gradle run, D) gradle execute");
        answers.add("A) gradle build");

        questions.add("How do you run a Gradle task?");
        options.add("A) gradle task <task-name>, B) gradle execute <task-name>, C) gradle run <task-name>, D) gradle <task-name>");
        answers.add("D) gradle <task-name>");

        questions.add("What is the purpose of settings.gradle file in Gradle?");
        options.add("A) To configure project settings, B) To define task dependencies, C) To manage plugin versions, D) To specify project structure");
        answers.add("A) To configure project settings");

        questions.add("Which plugin is required to build Java projects in Gradle?");
        options.add("A) java, B) groovy, C) build, D) application");
        answers.add("A) java");

        questions.add("How do you specify dependencies in a Gradle build file?");
        options.add("A) dependencies { ... }, B) requires { ... }, C) include { ... }, D) use { ... }");
        answers.add("A) dependencies { ... }");

        questions.add("What is the purpose of repositories in Gradle?");
        options.add("A) To store project artifacts, B) To manage plugin versions, C) To define project dependencies, D) To configure build settings");
        answers.add("C) To define project dependencies");

        questions.add("Which Gradle command is used to clean build outputs?");
        options.add("A) gradle clean, B) gradle clear, C) gradle delete, D) gradle remove");
        answers.add("A) gradle clean");

        questions.add("How do you specify a custom task in Gradle?");
        options.add("A) task customTask { ... }, B) defineTask customTask { ... }, C) createTask customTask { ... }, D) addTask customTask { ... }");
        answers.add("A) task customTask { ... }");

        questions.add("Which Gradle command is used to list all tasks in a project?");
        options.add("A) gradle list, B) gradle tasks, C) gradle show, D) gradle all");
        answers.add("B) gradle tasks");

        questions.add("What is the purpose of buildSrc directory in a Gradle project?");
        options.add("A) To store build scripts, B) To manage project artifacts, C) To define custom tasks and plugins, D) To host documentation");
        answers.add("C) To define custom tasks and plugins");

        questions.add("How do you include a Gradle plugin in a build script?");
        options.add("A) apply plugin: 'plugin-name', B) use plugin: 'plugin-name', C) add plugin: 'plugin-name', D) require plugin: 'plugin-name'");
        answers.add("A) apply plugin: 'plugin-name'");

        questions.add("Which Gradle command is used to execute a specific task?");
        options.add("A) gradle exec <task-name>, B) gradle do <task-name>, C) gradle run <task-name>, D) gradle <task-name>");
        answers.add("D) gradle <task-name>");

        questions.add("What is the purpose of build.gradle.kts file in Gradle?");
        options.add("A) To define Kotlin scripts for builds, B) To configure Kotlin projects, C) To handle Kotlin dependencies, D) To define build tasks in Kotlin");
        answers.add("A) To define Kotlin scripts for builds");

        questions.add("How do you specify project version in a Gradle build file?");
        options.add("A) version = '1.0.0', B) projectVersion = '1.0.0', C) setVersion('1.0.0'), D) version '1.0.0'");
        answers.add("A) version = '1.0.0'");

        questions.add("Which command is used to display Gradle version information?");
        options.add("A) gradle -v, B) gradle --version, C) gradle info, D) gradle version");
        answers.add("B) gradle --version");

        questions.add("How do you configure Gradle to use a specific JDK version?");
        options.add("A) Use JDK_HOME environment variable, B) Configure in gradle.properties, C) Use java.version property, D) Use toolchain configuration");
        answers.add("D) Use toolchain configuration");

        questions.add("What is the purpose of Gradle Wrapper?");
        options.add("A) To automate Gradle installation, B) To manage project dependencies, C) To build Java projects, D) To configure build tasks");
        answers.add("A) To automate Gradle installation");

        questions.add("Which Gradle command is used to run tests in a project?");
        options.add("A) gradle test, B) gradle run-tests, C) gradle execute-tests, D) gradle check");
        answers.add("A) gradle test");

        questions.add("How do you configure logging in Gradle?");
        options.add("A) Use log4j.properties, B) Configure in build.gradle, C) Use Gradle settings, D) Use @EnableLogging annotation");
        answers.add("B) Configure in build.gradle");

        questions.add("What is the purpose of Gradle Daemon?");
        options.add("A) To improve build performance, B) To manage project dependencies, C) To monitor build processes, D) To configure project properties");
        answers.add("A) To improve build performance");

        questions.add("Which Gradle command is used to generate project documentation?");
        options.add("A) gradle docs, B) gradle generate-docs, C) gradle javadoc, D) gradle documentation");
        answers.add("C) gradle javadoc");

        questions.add("How do you create a multi-module project in Gradle?");
        options.add("A) Use --multi-module option, B) Configure in settings.gradle, C) Use createMultiModuleProject task, D) Use include command");
        answers.add("B) Configure in settings.gradle");

        questions.add("What is the purpose of Gradle composite builds?");
        options.add("A) To combine multiple Gradle projects, B) To manage project versions, C) To configure Gradle plugins, D) To handle project dependencies");
        answers.add("A) To combine multiple Gradle projects");

        questions.add("Which Gradle command is used to include external dependencies?");
        options.add("A) gradle add-dependency, B) gradle include-dependency, C) gradle dependency, D) gradle add");
        answers.add("C) gradle dependency");

        questions.add("How do you publish artifacts to a Maven repository using Gradle?");
        options.add("A) Use publish task, B) Configure in build.gradle, C) Use Maven-publish plugin, D) Use publishToMaven task");
        answers.add("C) Use Maven-publish plugin");

        questions.add("What is the purpose of Gradle incremental build feature?");
        options.add("A) To optimize build times by reusing previous build outputs, B) To handle incremental tasks, C) To manage project dependencies, D) To configure build environment");
        answers.add("A) To optimize build times by reusing previous build outputs");

        questions.add("Which option is used to enable parallel execution of tasks in Gradle?");
        options.add("A) --parallel, B) --execute-parallel, C) --run-parallel, D) --enable-parallel");
        answers.add("A) --parallel");

    }
@Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Gradle_Quiz(name).setVisible(true);
    }
    
}