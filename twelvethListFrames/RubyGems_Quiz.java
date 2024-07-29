package twelvethListFrames;

import frame.Quiz;


/**
 * @author MuhammadHasnatRasool
 */
public class RubyGems_Quiz extends Quiz{
    

    public RubyGems_Quiz(String name) {
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


    // questions:48
    @Override
    public final void loadQuestions() {
        
      
        questions.add("What is a Gemfile in Ruby?");
        options.add("A) A Ruby script, B) A Ruby gem installer, C) A dependency manager file, D) A Ruby virtual environment");
        answers.add("C) A dependency manager file");

        questions.add("Which command is used to install gems specified in the Gemfile?");
        options.add("A) gem install Gemfile, B) bundle install, C) ruby install Gemfile, D) gems install");
        answers.add("B) bundle install");

        questions.add("How do you specify a gem version range in a Gemfile?");
        options.add("A) gem 'example', version: '>= 1.0', B) gem 'example', versions: '~> 1.0', C) gem 'example', '~> 1.0', D) gem 'example', '1.0.x'");
        answers.add("A) gem 'example', version: '>= 1.0'");

        questions.add("Which block in a Gemfile is used to specify gem dependencies?");
        options.add("A) dependencies { ... }, B) require { ... }, C) gem { ... }, D) source { ... }");
        answers.add("C) gem { ... }");

        questions.add("What is the purpose of the 'source' block in a Gemfile?");
        options.add("A) To specify gem sources, B) To define project settings, C) To manage gem versions, D) To configure gem deployment");
        answers.add("A) To specify gem sources");

        questions.add("How do you include a gem from a specific source in a Gemfile?");
        options.add("A) gem 'example', from: 'source-url', B) gem 'example', source: 'source-url', C) gem 'example', url: 'source-url', D) gem 'example', with: 'source-url'");
        answers.add("B) gem 'example', source: 'source-url'");

        questions.add("What does the '~> 1.0' version constraint mean in a Gemfile?");
        options.add("A) Exact version 1.0, B) Version 1.0 or higher, C) Any version in the 1.x range, D) Latest version");
        answers.add("C) Any version in the 1.x range");

        questions.add("How do you comment out a line in a Gemfile?");
        options.add("A) // Comment, B) # Comment, C) /* Comment */, D) <!-- Comment -->");
        answers.add("B) # Comment");

        questions.add("Which command is used to update gems specified in the Gemfile?");
        options.add("A) gem update, B) bundle update, C) update Gemfile, D) gems update");
        answers.add("B) bundle update");

        questions.add("How do you exclude a gem group from being installed?");
        options.add("A) exclude :group, B) ignore :group, C) group :exclude, D) group :development, :exclude => true");
        answers.add("D) group :development, :exclude => true");

        questions.add("What is the purpose of the 'platforms' block in a Gemfile?");
        options.add("A) To specify gem platforms, B) To manage gem versions, C) To define project platforms, D) To configure gem deployment");
        answers.add("A) To specify gem platforms");

        questions.add("How do you specify a gem as a development dependency in a Gemfile?");
        options.add("A) gem 'example' - type: 'development', B) gem 'example'- group: 'development', C) gem 'example' - development: true, D) gem 'example' :dev => true");
        answers.add("C) gem 'example' - development: true");

        questions.add("Which command is used to check gem versions specified in the Gemfile?");
        options.add("A) gem check, B) bundle check, C) check Gemfile, D) gems check");
        answers.add("B) bundle check");

        questions.add("How do you specify a gem as a runtime dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'runtime', B) gem 'example' group: 'runtime', C) gem 'example' runtime: true, D) gem 'example' :run => true");
        answers.add("A) gem 'example' type: 'runtime'");

        questions.add("What is the purpose of the 'require' block in a Gemfile?");
        options.add("A) To load gems, B) To specify gem requirements, C) To configure gem deployment, D) To manage gem versions");
        answers.add("A) To load gems");

        questions.add("How do you specify multiple gem sources in a Gemfile?");
        options.add("A) source 'url1', 'url2', B) sources 'url1', 'url2', C) source 'url1'\nsource 'url2', D) source 'url1' and 'url2'");
        answers.add("C) source 'url1'\nsource 'url2'");

        questions.add("Which command is used to list gems specified in the Gemfile?");
        options.add("A) gem list, B) bundle list, C) list Gemfile, D) gems list");
        answers.add("B) bundle list");

        questions.add("How do you specify a gem as a test dependency in a Gemfile?");
        options.add("A) gem 'example'- type: 'test', B) gem 'example'- group: 'test', C) gem 'example'- test: true, D) gem 'example'- :test => true");
        answers.add("A) gem 'example'- type: 'test'");

        questions.add("What is the purpose of the 'git' block in a Gemfile?");
        options.add("A) To specify gem dependencies from Git repositories, B) To manage gem versions, C) To define project settings, D) To configure gem deployment");
        answers.add("A) To specify gem dependencies from Git repositories");
        
        questions.add("How do you specify a gem from a Git repository in a Gemfile?");
        options.add("A) gem 'example' git: 'git-url', B) gem 'example' from: 'git-url', C) gem 'example' source: 'git-url', D) gem 'example' url: 'git-url'");
        answers.add("A) gem 'example' git: 'git-url'");

        questions.add("Which option is used to specify a gem path in a Gemfile?");
        options.add("A) --path, B) --gem-path, C) --set-path, D) --use-path");
        answers.add("A) --path");

        questions.add("How do you specify a gem as a production dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'production', B) gem 'example' group: 'production', C) gem 'example' production: true, D) gem 'example' :prod => true");
        answers.add("C) gem 'example' production: true");

        questions.add("What is the purpose of the 'source' block in a Gemfile.lock?");
        options.add("A) To specify gem sources, B) To define gem versions, C) To manage gem platforms, D) To configure gem deployment");
        answers.add("A) To specify gem sources");

        questions.add("How do you specify a gem as a system dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'system', B) gem 'example' group: 'system', C) gem 'example' system: true, D) gem 'example' :sys => true");
        answers.add("A) gem 'example' type: 'system'");

        questions.add("Which command is used to update Gemfile.lock with the latest gems?");
        options.add("A) gem update Gemfile.lock, B) bundle update, C) update Gemfile.lock, D) gems update");
        answers.add("B) bundle update");

        questions.add("How do you specify a gem as a platform-specific dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'platform', B) gem 'example' group: 'platform', C) gem 'example' platform: true, D) gem 'example' :platform => true");
        answers.add("D) gem 'example' :platform => true");

        questions.add("What is the purpose of the 'path' block in a Gemfile?");
        options.add("A) To specify gem paths, B) To manage gem versions, C) To define project settings, D) To configure gem deployment");
        answers.add("A) To specify gem paths");

        questions.add("Which command is used to check if all gems in the Gemfile are installed?");
        options.add("A) gem check, B) bundle check, C) check Gemfile, D) gems check");
        answers.add("B) bundle check");

        questions.add("How do you specify a gem as a development and test dependency in a Gemfile?");
        options.add("A) gem 'example' type: ['development' 'test'], B) gem 'example' group: ['development' 'test'], C) gem 'example' development: true test: true, D) gem 'example' :dev_test => true");
        answers.add("B) gem 'example' group: ['development' 'test']");

        questions.add("What is the purpose of the 'require_relative' block in a Gemfile?");
        options.add("A) To load gems relative to the current file, B) To specify gem requirements, C) To configure gem deployment, D) To manage gem versions");
        answers.add("A) To load gems relative to the current file");

        questions.add("Which command is used to install gems specified in the Gemfile without updating existing gems?");
        options.add("A) bundle install, B) bundle update, C) bundle install --no-update, D) gem install Gemfile");
        answers.add("A) bundle install");

        questions.add("How do you specify a gem as a default dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'default', B) gem 'example' group: 'default', C) gem 'example' default: true, D) gem 'example' :default => true");
        answers.add("C) gem 'example' default: true");

        questions.add("What is the purpose of the 'group' block in a Gemfile?");
        options.add("A) To specify gem groups, B) To manage gem versions, C) To define project settings, D) To configure gem deployment");
        answers.add("A) To specify gem groups");

        questions.add("Which command is used to uninstall gems specified in the Gemfile?");
        options.add("A) gem uninstall Gemfile, B) bundle uninstall, C) uninstall Gemfile, D) gems uninstall");
        answers.add("B) bundle uninstall");

        questions.add("How do you specify a gem as a test development dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'test_development', B) gem 'example' group: 'test_development', C) gem 'example' test_development: true, D) gem 'example' :test_dev => true");
        answers.add("B) gem 'example' group: 'test_development'");

        questions.add("What is the purpose of the 'require_relative' block in a Gemfile?");
        options.add("A) To load gems relative to the current file, B) To specify gem requirements, C) To configure gem deployment, D) To manage gem versions");
        answers.add("A) To load gems relative to the current file");

        questions.add("Which command is used to install gems specified in the Gemfile to a specific directory?");
        options.add("A) bundle install --path, B) bundle path install, C) install Gemfile --path, D) gem install --path");
        answers.add("A) bundle install --path");

        questions.add("How do you specify a gem as a runtime development dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'runtime_development', B) gem 'example' group: 'runtime_development', C) gem 'example' runtime_development: true, D) gem 'example' :runtime_dev => true");
        answers.add("B) gem 'example' group: 'runtime_development'");

        questions.add("What is the purpose of the 'require' block in a Gemfile?");
        options.add("A) To load gems, B) To specify gem requirements, C) To configure gem deployment, D) To manage gem versions");
        answers.add("A) To load gems");

        questions.add("Which command is used to list outdated gems specified in the Gemfile?");
        options.add("A) gem outdated, B) bundle outdated, C) outdated Gemfile, D) gems outdated");
        answers.add("B) bundle outdated");

        questions.add("How do you specify a gem as a development and runtime dependency in a Gemfile?");
        options.add("A) gem 'example' type: ['development' 'runtime'] B) gem 'example' group: ['development' 'runtime'], C) gem 'example' development: true runtime: true, D) gem 'example' :dev_runtime => true");
        answers.add("B) gem 'example' group: ['development' 'runtime']");

        questions.add("What is the purpose of the 'gemspec' block in a Gemfile?");
        options.add("A) To specify gem specifications, B) To manage gem versions, C) To define project settings, D) To configure gem deployment");
        answers.add("A) To specify gem specifications");

        questions.add("Which command is used to check for security vulnerabilities in gems specified in the Gemfile?");
        options.add("A) gem audit, B) bundle audit, C) audit Gemfile, D) gems audit");
        answers.add("B) bundle audit");

        questions.add("How do you specify a gem as a runtime test dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'runtime_test', B) gem 'example' group: 'runtime_test', C) gem 'example' runtime_test: true, D) gem 'example' :run_test => true");
        answers.add("A) gem 'example' type: 'runtime_test'");

        questions.add("What is the purpose of the 'require' block in a Gemfile?");
        options.add("A) To load gems, B) To specify gem requirements, C) To configure gem deployment, D) To manage gem versions");
        answers.add("A) To load gems");

        questions.add("Which command is used to list gems specified in the Gemfile with details?");
        options.add("A) gem info, B) bundle info, C) info Gemfile, D) gems info");
        answers.add("B) bundle info");

        questions.add("How do you specify a gem as a development test dependency in a Gemfile?");
        options.add("A) gem 'example' type: 'dev_test', B) gem 'example' group: 'dev_test', C) gem 'example' dev_test: true, D) gem 'example' :dev_test => true");
        answers.add("C) gem 'example' dev_test: true");

        questions.add("What is the purpose of the 'git' block in a Gemfile.lock?");
        options.add("A) To specify gem dependencies from Git repositories, B) To manage gem versions, C) To define gem sources, D) To configure gem deployment");
        answers.add("A) To specify gem dependencies from Git repositories");

        

       
    }

    
    public static void main(String[]args){
        new RubyGems_Quiz(name).setVisible(true);
    }
    
}