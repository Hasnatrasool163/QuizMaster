package twelvethListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Pip_Quiz extends Quiz{
    

    public Pip_Quiz(String name) {
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

// questions:
    @Override
    public final void loadQuestions() {
        
      
        questions.add("What is pip?");
        options.add("A) A package manager for Python, B) A Python module installer, C) A Python IDE, D) A Python virtual environment");
        answers.add("A) A package manager for Python");

        questions.add("How do you install a Python package using pip?");
        options.add("A) pip install <package-name>, B) pip add <package-name>, C) pip get <package-name>, D) pip setup <package-name>");
        answers.add("A) pip install <package-name>");

        questions.add("Which command is used to upgrade a Python package with pip?");
        options.add("A) pip upgrade <package-name>, B) pip update <package-name>, C) pip install --upgrade <package-name>, D) pip upgrade");
        answers.add("C) pip install --upgrade <package-name>");

        questions.add("How do you uninstall a Python package using pip?");
        options.add("A) pip remove <package-name>, B) pip delete <package-name>, C) pip uninstall <package-name>, D) pip discard <package-name>");
        answers.add("C) pip uninstall <package-name>");

        questions.add("Which command is used to list installed Python packages?");
        options.add("A) pip list, B) pip show, C) pip installed, D) pip packages");
        answers.add("A) pip list");

        questions.add("How do you search for Python packages using pip?");
        options.add("A) pip search <keyword>, B) pip find <keyword>, C) pip query <keyword>, D) pip lookup <keyword>");
        answers.add("A) pip search <keyword>");

        questions.add("What is the purpose of the requirements.txt file in Python projects?");
        options.add("A) To list required packages and versions, B) To configure Python interpreter, C) To store Python scripts, D) To document project requirements");
        answers.add("A) To list required packages and versions");

        questions.add("How do you install packages from a requirements.txt file using pip?");
        options.add("A) pip install requirements.txt, B) pip add requirements.txt, C) pip install -r requirements.txt, D) pip get requirements.txt");
        answers.add("C) pip install -r requirements.txt");

        questions.add("Which option is used to install a specific version of a package with pip?");
        options.add("A) --version=<version>, B) --install=<version>, C) --get=<version>, D) --add=<version>");
        answers.add("A) --version=<version>");

        questions.add("How do you install a package globally using pip?");
        options.add("A) pip install -g <package-name>, B) pip global install <package-name>, C) pip install --global <package-name>, D) pip install <package-name>");
        answers.add("A) pip install -g <package-name>");

        questions.add("What does the --user option do in pip install?");
        options.add("A) Installs packages globally, B) Installs packages for the current user only, C) Installs packages in virtual environment, D) Updates pip");
        answers.add("B) Installs packages for the current user only");

        questions.add("Which command is used to show details about a specific Python package?");
        options.add("A) pip info <package-name>, B) pip details <package-name>, C) pip show <package-name>, D) pip view <package-name>");
        answers.add("C) pip show <package-name>");

        questions.add("How do you upgrade pip itself?");
        options.add("A) pip update pip, B) pip install --upgrade pip, C) pip upgrade pip, D) pip install pip");
        answers.add("B) pip install --upgrade pip");

        questions.add("Which command is used to create a wheel (.whl) file from a Python package?");
        options.add("A) pip create <package-name>, B) pip make <package-name>, C) pip wheel <package-name>, D) pip build <package-name>");
        answers.add("C) pip wheel <package-name>");

        questions.add("What does the --no-cache-dir option do in pip install?");
        options.add("A) Disables pip cache, B) Clears pip cache, C) Uses pip cache, D) Updates pip cache");
        answers.add("A) Disables pip cache");

        questions.add("How do you uninstall all installed packages with pip?");
        options.add("A) pip remove --all, B) pip delete --all, C) pip uninstall --all, D) pip clean --all");
        answers.add("C) pip uninstall --all");

        questions.add("Which command is used to download a package without installing it?");
        options.add("A) pip download <package-name>, B) pip fetch <package-name>, C) pip get <package-name>, D) pip save <package-name>");
        answers.add("A) pip download <package-name>");

        questions.add("What is the purpose of the pip freeze command?");
        options.add("A) Lists installed packages and versions, B) Freezes Python interpreter, C) Clears pip cache, D) Freezes Python scripts");
        answers.add("A) Lists installed packages and versions");

        questions.add("Which option is used to specify a proxy for pip?");
        options.add("A) --proxy=<url>, B) --set-proxy=<url>, C) --use-proxy=<url>, D) --proxy-url=<url>");
        answers.add("A) --proxy=<url>");

        questions.add("How do you install a package from a local .tar.gz file using pip?");
        options.add("A) pip install file.tar.gz, B) pip add file.tar.gz, C) pip install --file=file.tar.gz, D) pip get file.tar.gz");
        answers.add("A) pip install file.tar.gz");

        questions.add("Which command is used to uninstall a package and its dependencies?");
        options.add("A) pip uninstall --all <package-name>, B) pip remove --recursive <package-name>, C) pip uninstall --cascade <package-name>, D) pip uninstall --dependencies <package-name>");
        answers.add("C) pip uninstall --cascade <package-name>");

        questions.add("What does the pip check command do?");
        options.add("A) Checks installed packages for updates, B) Checks package integrity, C) Checks pip configuration, D) Checks for pip updates");
        answers.add("B) Checks package integrity");

        questions.add("Which option is used to ignore installed packages when using pip check?");
        options.add("A) --ignore-installed, B) --ignore-packages, C) --skip-installed, D) --skip-check");
        answers.add("A) --ignore-installed");

        questions.add("How do you uninstall a package and its dependencies with pip?");
        options.add("A) pip uninstall --cascade <package-name>, B) pip delete --dependencies <package-name>, C) pip remove --cascade <package-name>, D) pip discard --dependencies <package-name>");
        answers.add("A) pip uninstall --cascade <package-name>");

        questions.add("Which command is used to install a package with its optional dependencies using pip?");
        options.add("A) pip install --optional <package-name>, B) pip install --with-optional <package-name>, C) pip install --extras <package-name>, D) pip install --install-optional <package-name>");
        answers.add("C) pip install --extras <package-name>");

        questions.add("How do you list outdated packages using pip?");
        options.add("A) pip outdated, B) pip update --list, C) pip list --outdated, D) pip show --updates");
        answers.add("A) pip outdated");

        questions.add("What is the purpose of the pip config command?");
        options.add("A) Manages pip configuration, B) Configures Python interpreter, C) Configures virtual environments, D) Manages pip cache");
        answers.add("A) Manages pip configuration");

        questions.add("Which option is used to specify a configuration file for pip?");
        options.add("A) --config=<file>, B) --use-config=<file>, C) --file=<config>, D) --config-file=<file>");
        answers.add("D) --config-file=<file>");

        questions.add("How do you uninstall a package and its dependencies recursively using pip?");
        options.add("A) pip uninstall --recursive <package-name>, B) pip delete --recursive <package-name>, C) pip remove --recursive <package-name>, D) pip discard --recursive <package-name>");
        answers.add("A) pip uninstall --recursive <package-name>");

        questions.add("What is the purpose of the pip show command?");
        options.add("A) Shows details about installed packages, B) Shows pip configuration, C) Shows Python interpreter details, D) Shows virtual environment details");
        answers.add("A) Shows details about installed packages");

       
    }

    
    public static void main(String[]args){
        new Pip_Quiz(name).setVisible(true);
    }
    
}