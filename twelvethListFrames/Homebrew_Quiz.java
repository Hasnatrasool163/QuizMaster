package twelvethListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Homebrew_Quiz extends Quiz{
    

    public Homebrew_Quiz(String name) {
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

// question:34
    @Override
    public final void loadQuestions() {
        
        questions.add("What is Homebrew?");
        options.add("A) A package manager for Linux, B) A package manager for macOS, C) A version control system, D) A programming language");
        answers.add("B) A package manager for macOS");

        questions.add("Which command is used to install a package with Homebrew?");
        options.add("A) brew add, B) brew install, C) brew get, D) brew fetch");
        answers.add("B) brew install");

        questions.add("How do you search for a package using Homebrew?");
        options.add("A) brew find <package>, B) brew search <package>, C) brew query <package>, D) brew locate <package>");
        answers.add("B) brew search <package>");

        questions.add("Which command updates Homebrew itself?");
        options.add("A) brew update, B) brew upgrade, C) brew refresh, D) brew update-homebrew");
        answers.add("A) brew update");

        questions.add("How do you list installed packages with Homebrew?");
        options.add("A) brew list, B) brew show, C) brew installed, D) brew packages");
        answers.add("A) brew list");

        questions.add("Which command is used to uninstall a package with Homebrew?");
        options.add("A) brew remove <package>, B) brew uninstall <package>, C) brew delete <package>, D) brew purge <package>");
        answers.add("B) brew uninstall <package>");

        questions.add("What does 'brew doctor' command do in Homebrew?");
        options.add("A) Uninstalls all packages, B) Fixes common issues, C) Lists available packages, D) Checks disk usage");
        answers.add("B) Fixes common issues");

        questions.add("How do you display information about a specific package in Homebrew?");
        options.add("A) brew info <package>, B) brew show <package>, C) brew details <package>, D) brew describe <package>");
        answers.add("A) brew info <package>");

        questions.add("Which directory does Homebrew use to store its packages?");
        options.add("A) /usr/local/bin, B) /opt/homebrew, C) /usr/local/homebrew, D) /usr/bin");
        answers.add("B) /opt/homebrew");

        questions.add("How do you upgrade all installed packages with Homebrew?");
        options.add("A) brew upgrade, B) brew update-all, C) brew install --upgrade, D) brew update && brew upgrade");
        answers.add("D) brew update && brew upgrade");

        questions.add("What is the purpose of 'brew tap' command in Homebrew?");
        options.add("A) To list installed taps, B) To update Homebrew, C) To manage package repositories, D) To search for packages");
        answers.add("C) To manage package repositories");

        questions.add("Which command is used to cleanup old versions of installed packages in Homebrew?");
        options.add("A) brew clean, B) brew clear, C) brew autoclean, D) brew cleanup");
        answers.add("D) brew cleanup");

        questions.add("How do you force install a package with Homebrew?");
        options.add("A) brew force install <package>, B) brew install --force <package>, C) brew install -f <package>, D) brew install --f <package>");
        answers.add("C) brew install -f <package>");

        questions.add("What does 'brew link' command do in Homebrew?");
        options.add("A) Links packages to /usr/local, B) Unlinks packages, C) Checks for broken links, D) Updates symbolic links");
        answers.add("A) Links packages to /usr/local");

        questions.add("How do you list all available versions of a package with Homebrew?");
        options.add("A) brew versions <package>, B) brew list versions <package>, C) brew versions show <package>, D) brew available <package>");
        answers.add("A) brew versions <package>");

        questions.add("Which command is used to switch between different versions of a package in Homebrew?");
        options.add("A) brew switch <package> <version>, B) brew change <package> <version>, C) brew select <package> <version>, D) brew version <package> <version>");
        answers.add("A) brew switch <package> <version>");

        questions.add("What is the purpose of 'brew services' command in Homebrew?");
        options.add("A) Installs background services, B) Manages Homebrew services, C) Checks service status, D) Lists available services");
        answers.add("B) Manages Homebrew services");

        questions.add("How do you start a service using 'brew services' in Homebrew?");
        options.add("A) brew services start <service>, B) brew start <service>, C) brew run <service>, D) brew service start <service>");
        answers.add("D) brew service start <service>");

        questions.add("Which command is used to stop a service using 'brew services' in Homebrew?");
        options.add("A) brew services stop <service>, B) brew stop <service>, C) brew service stop <service>, D) brew end <service>");
        answers.add("C) brew service stop <service>");

        questions.add("What is the purpose of 'brew analytics' command in Homebrew?");
        options.add("A) Collects usage statistics, B) Manages Homebrew configurations, C) Analyzes package dependencies, D) Updates package index");
        answers.add("A) Collects usage statistics");

        questions.add("How do you reset Homebrew to its initial state?");
        options.add("A) brew reset, B) brew clean, C) brew reinstall, D) brew reset-homebrew");
        answers.add("C) brew reinstall");

        questions.add("Which command is used to install a specific version of a package with Homebrew?");
        options.add("A) brew install <package>@<version>, B) brew version install <package> <version>, C) brew install <package> --version <version>, D) brew install <package> <version>");
        answers.add("A) brew install <package>@<version>");

        questions.add("How do you list installed taps with Homebrew?");
        options.add("A) brew list taps, B) brew taps list, C) brew list --taps, D) brew show taps");
        answers.add("B) brew taps list");

        questions.add("What is the purpose of 'brew bundle' command in Homebrew?");
        options.add("A) Installs bundled packages, B) Bundles installed packages, C) Manages bundle configurations, D) Updates bundle index");
        answers.add("B) Bundles installed packages");

        questions.add("How do you uninstall all packages installed with Homebrew?");
        options.add("A) brew uninstall all, B) brew remove --all, C) brew uninstall --all, D) brew list | xargs brew uninstall");
        answers.add("D) brew list | xargs brew uninstall");

        questions.add("Which command is used to list installed versions of a package with Homebrew?");
        options.add("A) brew list versions <package>, B) brew versions <package>, C) brew list --versions <package>, D) brew versions show <package>");
        answers.add("C) brew list --versions <package>");

        questions.add("How do you edit the formula for a package in Homebrew?");
        options.add("A) brew edit <package>, B) brew modify <package>, C) brew change <package>, D) brew update <package>");
        answers.add("A) brew edit <package>");

        questions.add("What is the purpose of 'brew fetch' command in Homebrew?");
        options.add("A) Fetches package information, B) Downloads package files, C) Updates package index, D) Refreshes package list");
        answers.add("B) Downloads package files");

        questions.add("How do you display the installation options for a package with Homebrew?");
        options.add("A) brew options <package>, B) brew show options <package>, C) brew info --options <package>, D) brew view options <package>");
        answers.add("A) brew options <package>");

        questions.add("Which command is used to upgrade a specific package with Homebrew?");
        options.add("A) brew upgrade <package>, B) brew update <package>, C) brew install --upgrade <package>, D) brew install <package> --upgrade");
        answers.add("A) brew upgrade <package>");

        questions.add("How do you create a custom tap in Homebrew?");
        options.add("A) brew tap create <tap-name>, B) brew create tap <tap-name>, C) brew tap new <tap-name>, D) brew new tap <tap-name>");
        answers.add("C) brew tap new <tap-name>");

        questions.add("What is the purpose of 'brew unlink' command in Homebrew?");
        options.add("A) Unlinks packages, B) Links packages, C) Checks for broken links, D) Updates symbolic links");
        answers.add("A) Unlinks packages");

        questions.add("How do you list the dependencies of a package with Homebrew?");
        options.add("A) brew dependencies <package>, B) brew depends <package>, C) brew list dependencies <package>, D) brew show dependencies <package>");
        answers.add("B) brew depends <package>");

        questions.add("Which command is used to display the current Homebrew configuration?");
        options.add("A) brew config, B) brew show config, C) brew view config, D) brew display config");
        answers.add("A) brew config");


       
    }

    public static void main(String[]args){
        new Homebrew_Quiz(name).setVisible(true);
    }
    
}