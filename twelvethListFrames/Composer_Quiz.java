package twelvethListFrames;

import frame.Quiz;
import java.awt.event.ActionEvent;

/**
 * @author MuhammadHasnatRasool
 */
public class Composer_Quiz extends Quiz{
    

    public Composer_Quiz(String name) {
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


    // questions:39
    @Override
    public final void loadQuestions() {
        
      
        questions.add("What is Composer?");
        options.add("A) A package manager for JavaScript, B) A package manager for PHP, C) A build tool for Java, D) A version control system");
        answers.add("B) A package manager for PHP");

        questions.add("Which command is used to initialize a new Composer project?");
        options.add("A) composer new <project-name>, B) composer init <project-name>, C) composer start <project-name>, D) composer create-project <project-name>");
        answers.add("D) composer create-project <project-name>");
        
        questions.add("How do you add a dependency to a Composer project?");
        options.add("A) Add it to composer.json manually, B) composer add <dependency>, C) composer require <dependency>, D) composer install <dependency>");
        answers.add("C) composer require <dependency>");

        questions.add("Which file specifies project dependencies in a Composer project?");
        options.add("A) composer.lock, B) composer.json, C) dependencies.json, D) package.json");
        answers.add("B) composer.json");
        
        questions.add("What is the purpose of 'composer install' command?");
        options.add("A) Installs Composer itself, B) Installs project dependencies, C) Updates project dependencies, D) Removes project dependencies");
        answers.add("B) Installs project dependencies");
        
        questions.add("How do you update dependencies to their latest versions in a Composer project?");
        options.add("A) composer update, B) composer upgrade, C) composer refresh, D) composer install --update");
        answers.add("A) composer update");

        questions.add("Which command is used to remove a dependency from a Composer project?");
        options.add("A) composer remove <dependency>, B) composer delete <dependency>, C) composer uninstall <dependency>, D) composer purge <dependency>");
        answers.add("A) composer remove <dependency>");
        
        questions.add("How do you list installed dependencies in a Composer project?");
        options.add("A) composer list, B) composer show, C) composer installed, D) composer dependencies");
        answers.add("B) composer show");

        questions.add("What is the purpose of 'composer dump-autoload' command in Composer?");
        options.add("A) Generates the autoload files, B) Dumps project metadata, C) Clears cache, D) Updates Composer");
        answers.add("A) Generates the autoload files");

        questions.add("Which command is used to remove a specific feature from a dependency in a Composer project?");
        options.add("A) composer remove-feature <dependency> --feature <feature-name>, B) composer delete-feature <dependency> --feature <feature-name>, C) composer uninstall <dependency> --feature <feature-name>, D) composer remove <dependency> --feature <feature-name>");
        answers.add("D) composer remove <dependency> --feature <feature-name>");

        questions.add("How do you update Composer itself to the latest version?");
        options.add("A) composer upgrade, B) composer self-update, C) composer update-composer, D) composer update --self");
        answers.add("B) composer self-update");

        questions.add("What does 'composer clear-cache' command do in Composer?");
        options.add("A) Clears Composer cache, B) Clears project cache, C) Clears PHP cache, D) Clears system cache");
        answers.add("A) Clears Composer cache");

        questions.add("How do you create a Composer package from an existing directory?");
        options.add("A) composer build <package-name>, B) composer create <package-name> --from-dir, C) composer init <package-name> --dir, D) composer new-package <package-name>");
        answers.add("B) composer create <package-name> --from-dir");

        questions.add("Which command is used to update Composer dependencies without modifying composer.lock?");
        options.add("A) composer update --no-lock, B) composer update --preserve-lock, C) composer update --ignore-lock, D) composer update --lockless");
        answers.add("B) composer update --preserve-lock");

        questions.add("How do you specify a minimum stability for dependencies in Composer?");
        options.add("A) Update composer.json manually, B) composer require <dependency> --min-stability <level>, C) composer install <dependency> --stability <level>, D) composer update <dependency> --min-stability <level>");
        answers.add("B) composer require <dependency> --min-stability <level>");

        questions.add("Which command is used to update a specific dependency to a new version in Composer?");
        options.add("A) composer update <dependency>, B) composer upgrade <dependency>, C) composer require <dependency>, D) composer install <dependency>");
        answers.add("C) composer require <dependency>");

        questions.add("How do you specify a PHP version requirement for a Composer project?");
        options.add("A) Update composer.json manually, B) composer require php <version>, C) composer install php <version>, D) composer update php <version>");
        answers.add("B) composer require php <version>");

        questions.add("Which command is used to list all available Composer commands?");
        options.add("A) composer commands, B) composer list, C) composer help, D) composer");
        answers.add("C) composer help");

        questions.add("What is the purpose of 'composer global show' command in Composer?");
        options.add("A) Shows all globally installed packages, B) Shows Composer global settings, C) Shows detailed info about Composer, D) Shows globally installed PHP versions");
        answers.add("A) Shows all globally installed packages");

        questions.add("How do you update all global Composer packages to the latest version?");
        options.add("A) composer global update, B) composer global upgrade, C) composer update-global, D) composer update --global");
        answers.add("A) composer global update");

        questions.add("Which command is used to uninstall a global Composer package?");
        options.add("A) composer global remove <package-name>, B) composer delete <package-name>, C) composer uninstall <package-name> --global, D) composer rm <package-name> --global");
        answers.add("A) composer global remove <package-name>");

        questions.add("How do you check for outdated Composer packages?");
        options.add("A) composer outdated, B) composer update --outdated, C) composer list --outdated, D) composer show --outdated");
        answers.add("A) composer outdated");

        questions.add("What is the purpose of 'composer diagnose' command in Composer?");
        options.add("A) Diagnoses Composer installation issues, B) Diagnoses project issues, C) Diagnoses PHP installation issues, D) Diagnoses dependency issues");
        answers.add("A) Diagnoses Composer installation issues");

        questions.add("How do you create a Composer package from an existing repository?");
        options.add("A) composer new-package <package-name>, B) composer create <package-name> --from-repo, C) composer init <package-name> --repo, D) composer build <package-name> --from-repo");
        answers.add("B) composer create <package-name> --from-repo");

        questions.add("Which command is used to install Composer plugins?");
        options.add("A) composer install-plugin <plugin-name>, B) composer require-plugin <plugin-name>, C) composer add-plugin <plugin-name>, D) composer plugin <plugin-name>");
        answers.add("B) composer require-plugin <plugin-name>");

        questions.add("How do you create a Composer project without including the default README?");
        options.add("A) composer create-project <project-name> --no-readme, B) composer new <project-name> --no-readme, C) composer init <project-name> --no-readme, D) composer generate <project-name> --no-readme");
        answers.add("A) composer create-project <project-name> --no-readme");

        questions.add("What does 'composer dump-autoload -o' command do in Composer?");
        options.add("A) Optimizes Composer autoload, B) Dumps Composer autoload, C) Clears Composer cache, D) Updates Composer autoload");
        answers.add("A) Optimizes Composer autoload");

        questions.add("Which command is used to list all Composer packages installed globally?");
        options.add("A) composer global list, B) composer list-global, C) composer global show --all, D) composer show --global");
        answers.add("A) composer global list");

        questions.add("How do you remove all Composer caches?");
        options.add("A) composer clear-cache --all, B) composer clear --cache, C) composer cache-clear --all, D) composer cache-clear");
        answers.add("D) composer cache-clear");

        questions.add("What is the purpose of 'composer dump' command in Composer?");
        options.add("A) Dumps Composer autoload, B) Dumps project metadata, C) Dumps PHP cache, D) Dumps Composer packages");
        answers.add("B) Dumps project metadata");

        questions.add("How do you install a specific version of a Composer package?");
        options.add("A) composer add <package>:<version>, B) composer require <package> --version <version>, C) composer install <package>:<version>, D) composer update <package>:<version>");
        answers.add("B) composer require <package> --version <version>");

        questions.add("Which command is used to create a new Composer project interactively?");
        options.add("A) composer new, B) composer create, C) composer init, D) composer start");
        answers.add("C) composer init");

        questions.add("How do you install Composer globally on your system?");
        options.add("A) composer install-global, B) composer global-install, C) composer install --global, D) composer global require");
        answers.add("D) composer global require");

        questions.add("What does 'composer why' command do in Composer?");
        options.add("A) Displays why a package is installed, B) Displays package conflicts, C) Displays package details, D) Displays Composer version");
        answers.add("A) Displays why a package is installed");

        questions.add("How do you update Composer to a specific version?");
        options.add("A) composer update --version <version>, B) composer require composer:<version>, C) composer self-update <version>, D) composer update-composer --version <version>");
        answers.add("B) composer require composer:<version>");

        questions.add("Which command is used to update Composer to the latest nightly build?");
        options.add("A) composer update --nightly, B) composer self-update --nightly, C) composer upgrade --nightly, D) composer update-composer --nightly");
        answers.add("B) composer self-update --nightly");

        questions.add("How do you create a Composer package from a GitHub repository?");
        options.add("A) composer new <package-name> --from-github, B) composer create <package-name> --repo <github-url>, C) composer init <package-name> --from-github, D) composer build <package-name> --github");
        answers.add("C) composer init <package-name> --from-github");

        questions.add("What is the purpose of 'composer archive' command in Composer?");
        options.add("A) Archives Composer installation, B) Archives project directory, C) Creates package archive, D) Extracts package archive");
        answers.add("C) Creates package archive");

        questions.add("Which command is used to install packages without updating the lock file in Composer?");
        options.add("A) composer install --no-lock, B) composer require --no-update, C) composer update --lockless, D) composer require --no-lock-update");
        answers.add("B) composer require --no-update");

        

       
    }
@Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Composer_Quiz(name).setVisible(true);
    }
    
}