package twelvethListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Nu_Get_Quiz extends Quiz {
    
    public Nu_Get_Quiz(String name) {
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
        
        questions.add("What is NuGet?");
        options.add("A) A package manager for Python, B) A package manager for JavaScript, C) A package manager for PHP, D) A package manager for .NET");
        answers.add("D) A package manager for .NET");
        
        questions.add("Which command is used to install a package in a .NET project using NuGet?");
        options.add("A) nuget install <package-name>, B) nuget add <package-name>, C) nuget install-package <package-name>, D) nuget add-package <package-name>");
        answers.add("C) nuget install-package <package-name>");
        
        questions.add("How do you specify a specific version of a package to install in a .NET project with NuGet?");
        options.add("A) nuget install <package>:<version>, B) nuget install-package <package> -version <version>, C) nuget add <package> --version <version>, D) nuget add-package <package>:<version>");
        answers.add("B) nuget install-package <package> -version <version>");
        
        questions.add("Which file is used to specify dependencies in a .NET project with NuGet?");
        options.add("A) package.config, B) dependencies.json, C) nuget.json, D) packages.config");
        answers.add("D) packages.config");
        
        questions.add("What does 'nuget update' command do in NuGet?");
        options.add("A) Updates NuGet itself, B) Updates all packages to latest versions, C) Updates package dependencies, D) Updates .NET framework");
        answers.add("A) Updates NuGet itself");
        
        questions.add("How do you uninstall a package from a .NET project using NuGet?");
        options.add("A) nuget uninstall <package-name>, B) nuget delete-package <package-name>, C) nuget remove <package-name>, D) nuget uninstall-package <package-name>");
        answers.add("D) nuget uninstall-package <package-name>");
        
        questions.add("Which command is used to list installed packages in a .NET project using NuGet?");
        options.add("A) nuget list, B) nuget show, C) nuget installed, D) nuget list-packages");
        answers.add("D) nuget list-packages");
        
        questions.add("What is the purpose of 'nuget restore' command in NuGet?");
        options.add("A) Restores NuGet packages, B) Restores project settings, C) Restores .NET framework, D) Restores package sources");
        answers.add("A) Restores NuGet packages");
        
        questions.add("How do you search for packages in the NuGet Gallery?");
        options.add("A) nuget search <package-name>, B) nuget find <package-name>, C) nuget query <package-name>, D) nuget search-packages <package-name>");
        answers.add("A) nuget search <package-name>");
        
        questions.add("Which command is used to push a package to a NuGet repository?");
        options.add("A) nuget push <package-name>, B) nuget upload <package-name>, C) nuget publish <package-name>, D) nuget send <package-name>");
        answers.add("A) nuget push <package-name>");
        
        questions.add("How do you create a new NuGet package?");
        options.add("A) nuget create <package-name>, B) nuget new <package-name>, C) nuget init <package-name>, D) nuget pack <package-name>");
        answers.add("D) nuget pack <package-name>");
        
        questions.add("What is the purpose of 'nuget config' command in NuGet?");
        options.add("A) Configures NuGet settings, B) Configures project settings, C) Configures package dependencies, D) Configures .NET framework");
        answers.add("A) Configures NuGet settings");
        
        questions.add("How do you update all packages in a .NET project using NuGet?");
        options.add("A) nuget update-all, B) nuget update-packages, C) nuget update --all, D) nuget update");
        answers.add("D) nuget update");
        
        questions.add("Which command is used to create a NuGet package from a .nuspec file?");
        options.add("A) nuget create <package-name>.nuspec, B) nuget pack <package-name>.nuspec, C) nuget generate <package-name>.nuspec, D) nuget build <package-name>.nuspec");
        answers.add("B) nuget pack <package-name>.nuspec");
        
        questions.add("How do you add a package source in NuGet?");
        options.add("A) nuget add-source <source-url>, B) nuget source-add <source-url>, C) nuget source <source-url>, D) nuget include-source <source-url>");
        answers.add("C) nuget source <source-url>");
        
        questions.add("What does 'nuget sources' command do in NuGet?");
        options.add("A) Lists all available package sources, B) Adds new package sources, C) Removes package sources, D) Updates package sources");
        answers.add("A) Lists all available package sources");
        
        questions.add("How do you specify a target framework for a package in NuGet?");
        options.add("A) Update .csproj file manually, B) nuget set-target <target-framework>, C) nuget target <target-framework>, D) nuget framework <target-framework>");
        answers.add("A) Update .csproj file manually");
        
        questions.add("Which command is used to verify a package in NuGet?");
        options.add("A) nuget verify <package-name>, B) nuget check <package-name>, C) nuget test <package-name>, D) nuget validate <package-name>");
        answers.add("D) nuget validate <package-name>");
        
        questions.add("How do you list package details in NuGet?");
        options.add("A) nuget details <package-name>, B) nuget info <package-name>, C) nuget show <package-name>, D) nuget inspect <package-name>");
        answers.add("C) nuget show <package-name>");
        
        questions.add("What is the purpose of 'nuget locals' command in NuGet?");
        options.add("A) Manages local package cache, B) Manages project cache, C) Manages global package cache, D) Manages .NET framework cache");
        answers.add("A) Manages local package cache");
        
        questions.add("How do you add a new dependency to a .NET project using NuGet?");
        options.add("A) nuget add <dependency>, B) nuget require <dependency>, C) nuget install <dependency>, D) nuget add-package <dependency>");
        answers.add("C) nuget install <dependency>");
        
        questions.add("Which command is used to configure API keys for a NuGet repository?");
        options.add("A) nuget configure-api-key, B) nuget set-api-key, C) nuget api-key, D) nuget key");
        answers.add("C) nuget api-key");
        
        questions.add("How do you set a verbosity level for NuGet commands?");
        options.add("A) nuget set-verbosity <level>, B) nuget verbosity <level>, C) nuget config-verbosity <level>, D) nuget verbose <level>");
        answers.add("B) nuget verbosity <level>");
        
        questions.add("What is the purpose of 'nuget delete' command in NuGet?");
        options.add("A) Deletes packages from a repository, B) Deletes local packages, C) Deletes package sources, D) Deletes NuGet installation");
        answers.add("A) Deletes packages from a repository");
        
        questions.add("How do you view installed package licenses in NuGet?");
        options.add("A) nuget license <package-name>, B) nuget view-license <package-name>, C) nuget show-license <package-name>, D) nuget licenses <package-name>");
        answers.add("D) nuget licenses <package-name>");
        
        questions.add("Which command is used to verify package integrity in NuGet?");
        options.add("A) nuget check <package-name>, B) nuget integrity <package-name>, C) nuget verify <package-name>, D) nuget validate <package-name>");
        answers.add("C) nuget verify <package-name>");
        
        questions.add("How do you configure package sources for NuGet?");
        options.add("A) nuget config-source <source-url>, B) nuget sources <source-url>, C) nuget set-sources <source-url>, D) nuget configure-sources <source-url>");
        answers.add("B) nuget sources <source-url>");
        
        questions.add("What is the purpose of 'nuget pack' command in NuGet?");
        options.add("A) Packages a project into a .nupkg file, B) Publishes a package to NuGet Gallery, C) Installs packages locally, D) Updates NuGet installation");
        answers.add("A) Packages a project into a .nupkg file");
        
        questions.add("Which command is used to list package updates available in NuGet?");
        options.add("A) nuget list --updates, B) nuget search --updates, C) nuget find --updates, D) nuget update --list");
        answers.add("A) nuget list --updates");
        
        questions.add("How do you update NuGet package sources?");
        options.add("A) nuget update-sources, B) nuget refresh-sources, C) nuget sources-update, D) nuget sources-refresh");
        answers.add("B) nuget refresh-sources");
        
        questions.add("What is the purpose of 'nuget mirror' command in NuGet?");
        options.add("A) Mirrors a package source, B) Mirrors local packages, C) Mirrors package updates, D) Mirrors NuGet installation");
        answers.add("A) Mirrors a package source");
        
        questions.add("How do you configure HTTP proxy settings for NuGet?");
        options.add("A) nuget proxy-config, B) nuget config-proxy, C) nuget set-proxy, D) nuget proxy");
        answers.add("C) nuget set-proxy");
        
        questions.add("Which command is used to manage package signing in NuGet?");
        options.add("A) nuget sign, B) nuget manage-signing, C) nuget configure-signing, D) nuget enable-signing");
        answers.add("C) nuget configure-signing");
        
        questions.add("How do you force NuGet to use the latest version of a package?");
        options.add("A) Update .csproj manually, B) nuget use <package-name> --latest, C) nuget update <package-name> --latest, D) nuget install <package-name> --force");
        answers.add("C) nuget update <package-name> --latest");
        
        questions.add("What is the purpose of 'nuget source' command in NuGet?");
        options.add("A) Adds a package source, B) Updates package sources, C) Lists available sources, D) Removes a package source");
        answers.add("A) Adds a package source");
        
        questions.add("How do you specify a version range for a package in NuGet?");
        options.add("A) Update .csproj manually, B) nuget set-version <package-name> --range <version>, C) nuget install <package-name> --version-range <version>, D) nuget update <package-name> --range <version>");
        answers.add("C) nuget install <package-name> --version-range <version>");
        
        questions.add("Which command is used to create a NuGet package from a .NET project?");
        options.add("A) nuget create, B) nuget pack, C) nuget new-package, D) nuget build-package");
        answers.add("B) nuget pack");
        
        questions.add("How do you install a specific version of NuGet package into a project?");
        options.add("A) nuget add <package-name> --version <version>, B) nuget require <package-name> --version <version>, C) nuget install <package-name> -version <version>, D) nuget update <package-name> --version <version>");
        answers.add("A) nuget add <package-name> --version <version>");
        
        questions.add("What is the purpose of 'nuget locals all -clear' command in NuGet?");
        options.add("A) Clears all NuGet caches, B) Clears local packages cache, C) Clears global packages cache, D) Clears package sources cache");
        answers.add("A) Clears all NuGet caches");
        
        questions.add("Which command is used to verify package integrity in NuGet?");
        options.add("A) nuget check <package-name>, B) nuget integrity <package-name>, C) nuget verify <package-name>, D) nuget validate <package-name>");
        answers.add("C) nuget verify <package-name>");
        
    }

    public static void main(String[] args) {
        new Nu_Get_Quiz(name).setVisible(true);
    }
    
}
