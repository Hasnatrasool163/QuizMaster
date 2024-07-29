package twelvethListFrames;

import frame.Quiz;


/**
 * @author MuhammadHasnatRasool
 */
public class Npm_Quiz extends Quiz{
    

    public Npm_Quiz(String name) {
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


    // questions:35
    @Override
    public final void loadQuestions() {
        
        questions.add("What does npm stand for?");
        options.add("A) Node Package Manager, B) New Package Manager, C) Network Package Manager, D) Nodejs Package Manager");
        answers.add("A) Node Package Manager");

        questions.add("How do you initialize a new npm package in a directory?");
        options.add("A) npm start, B) npm init, C) npm install, D) npm create");
        answers.add("B) npm init");

        questions.add("Which npm command is used to install dependencies listed in package.json?");
        options.add("A) npm update, B) npm add, C) npm install, D) npm setup");
        answers.add("C) npm install");

        questions.add("What is the purpose of the --save flag in npm install?");
        options.add("A) To save installed packages to package.json, B) To run installation silently, C) To force install, D) To install specific version");
        answers.add("A) To save installed packages to package.json");

        questions.add("How do you install a package globally using npm?");
        options.add("A) npm add -g, B) npm install -g, C) npm setup -g, D) npm global");
        answers.add("B) npm install -g");

        questions.add("Which npm command is used to uninstall a package?");
        options.add("A) npm remove, B) npm uninstall, C) npm delete, D) npm discard");
        answers.add("B) npm uninstall");

        questions.add("How do you update npm to the latest version?");
        options.add("A) npm upgrade npm, B) npm install -g npm, C) npm update -g, D) npm latest");
        answers.add("B) npm install -g npm");

        questions.add("Which npm command is used to list installed packages?");
        options.add("A) npm list, B) npm show, C) npm installed, D) npm ls");
        answers.add("D) npm ls");

        questions.add("How do you view details about a specific npm package?");
        options.add("A) npm details <package>, B) npm view <package>, C) npm info <package>, D) npm about <package>");
        answers.add("C) npm info <package>");

        questions.add("What does the npm audit command do?");
        options.add("A) Audits installed packages for vulnerabilities, B) Audits package.json file, C) Audits npm registry, D) Audits npm cache");
        answers.add("A) Audits installed packages for vulnerabilities");

        questions.add("How do you search for packages on the npm registry?");
        options.add("A) npm search <keyword>, B) npm find <keyword>, C) npm query <keyword>, D) npm lookup <keyword>");
        answers.add("A) npm search <keyword>");

        questions.add("What does the npm link command do?");
        options.add("A) Links a local package to the global npm registry, B) Links a global package to a local project, C) Links dependencies in package.json, D) Links npm documentation");
        answers.add("B) Links a global package to a local project");

        questions.add("How do you publish a package to the npm registry?");
        options.add("A) npm upload, B) npm push, C) npm publish, D) npm release");
        answers.add("C) npm publish");

        questions.add("What does the npm prune command do?");
        options.add("A) Prunes unused dependencies from node_modules, B) Prunes npm cache, C) Prunes package.json, D) Prunes installed packages");
        answers.add("A) Prunes unused dependencies from node_modules");

        questions.add("Which npm command is used to run scripts defined in package.json?");
        options.add("A) npm start, B) npm run, C) npm execute, D) npm script");
        answers.add("B) npm run");

        questions.add("How do you specify a specific version of a package to install using npm?");
        options.add("A) npm version <package>@<version>, B) npm install <package> --version=<version>, C) npm get <package>@<version>, D) npm specify <package>@<version>");
        answers.add("A) npm version <package>@<version>");

        questions.add("What is the purpose of the npm init -y command?");
        options.add("A) Initializes npm without prompting for input, B) Initializes npm with default settings, C) Initializes npm in yes mode, D) Initializes npm for yarn compatibility");
        answers.add("A) Initializes npm without prompting for input");

        questions.add("How do you install packages listed in devDependencies in package.json?");
        options.add("A) npm install --dev, B) npm dev, C) npm add --dev, D) npm install --only-dev");
        answers.add("C) npm add --dev");

        questions.add("Which npm command is used to view npm configuration details?");
        options.add("A) npm config, B) npm settings, C) npm show config, D) npm view config");
        answers.add("A) npm config");

        questions.add("How do you uninstall a globally installed npm package?");
        options.add("A) npm remove -g <package>, B) npm uninstall -g <package>, C) npm delete -g <package>, D) npm discard -g <package>");
        answers.add("B) npm uninstall -g <package>");

        questions.add("What does the npm outdated command do?");
        options.add("A) Lists outdated npm packages, B) Updates outdated npm packages, C) Deletes outdated npm packages, D) Audits outdated npm packages");
        answers.add("A) Lists outdated npm packages");

        questions.add("How do you configure npm to use a specific registry?");
        options.add("A) npm set registry <url>, B) npm use registry <url>, C) npm config registry <url>, D) npm register <url>");
        answers.add("A) npm set registry <url>");

        questions.add("Which npm command is used to create a new package version?");
        options.add("A) npm version, B) npm create, C) npm new-version, D) npm release");
        answers.add("A) npm version");

        questions.add("How do you view the npm cache contents?");
        options.add("A) npm cache list, B) npm view cache, C) npm show cache, D) npm cache show");
        answers.add("D) npm cache show");

        questions.add("What does the npm dedupe command do?");
        options.add("A) Deduplicates installed packages in node_modules, B) Removes duplicates from package.json, C) Deletes duplicate npm cache entries, D) Audits duplicate npm packages");
        answers.add("A) Deduplicates installed packages in node_modules");

        questions.add("How do you install a specific version of npm package?");
        options.add("A) npm install <package>@<version>, B) npm add <package>@<version>, C) npm get <package>@<version>, D) npm use <package>@<version>");
        answers.add("A) npm install <package>@<version>");

        questions.add("What is the purpose of the npm shrinkwrap command?");
        options.add("A) Locks down dependency versions, B) Shrinks npm cache, C) Shrinks node_modules size, D) Shrinks package.json file");
        answers.add("A) Locks down dependency versions");

        questions.add("How do you view npm configuration settings?");
        options.add("A) npm get, B) npm show, C) npm config list, D) npm config get");
        answers.add("D) npm config get");

        questions.add("Which npm command is used to remove all npm modules?");
        options.add("A) npm clear, B) npm clean, C) npm remove-all, D) npm uninstall --all");
        answers.add("B) npm clean");

        questions.add("How do you update all global npm packages to the latest version?");
        options.add("A) npm update -g, B) npm upgrade -g, C) npm install -g --latest, D) npm global update");
        answers.add("B) npm upgrade -g");

        questions.add("What does the npm cache clean --force command do?");
        options.add("A) Cleans npm cache forcefully, B) Clears npm install cache, C) Cleans npm global cache, D) Removes npm cache entries");
        answers.add("A) Cleans npm cache forcefully");

        questions.add("How do you uninstall all npm packages globally?");
        options.add("A) npm uninstall -g --all, B) npm clear -g, C) npm delete -g --all, D) npm uninstall --global");
        answers.add("A) npm uninstall -g --all");

        questions.add("Which npm command is used to install packages from a specific version of npm?");
        options.add("A) npm install --from, B) npm get --version, C) npm install --npm-version, D) npm install --version");
        answers.add("C) npm install --npm-version");

        questions.add("How do you configure npm to use a proxy?");
        options.add("A) npm proxy set <url>, B) npm set proxy <url>, C) npm config proxy <url>, D) npm use proxy <url>");
        answers.add("B) npm set proxy <url>");

        questions.add("What is the purpose of the npm rebuild command?");
        options.add("A) Rebuilds npm cache, B) Rebuilds node_modules, C) Reinstalls npm, D) Rebuilds npm registry");
        answers.add("B) Rebuilds node_modules");

    }

    public static void main(String[]args){
        new Npm_Quiz(name).setVisible(true);
    }
    
}