package twelvethListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Maven_Quiz extends Quiz {
    
    public Maven_Quiz(String name) {
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
    
    // questions:66
    @Override
    public final void loadQuestions() {
        
        questions.add(" What element in the pom.xml file allows you to provide values that can be reused in other elements of the pom.xml?");
        options.add("A)Plugins, B)Build, C)Properties, D)Parent");
        answers.add("D)Parent");
        
        questions.add(" If you wish to build and package your artifact using the Maven package goal but don't want to execute the unit tests, which environment variable and value would you use?");
        options.add("A)`maven.test.ignore=TRUE`, B)`maven.test.run=FALSE`, C)`maven.test.skip=TRUE`, D)`maven.verify.execute=FALSE`");
        answers.add("C)`maven.test.skip=TRUE`");
        
        questions.add(" When building a Maven EAR project and specifying the configuration of which projects to include, what is the element in the plugin configuration that contains Enterprise Java Bean projects?");
        options.add("A)modules/webModule, B)modules/ejbModule, C)modules/enterpriseModules, D)modules/services");
        answers.add("B)modules/ejbModule");
        
        questions.add(" The goal that is executed to generate and deploy a documentation website is _________.");
        options.add("A)deliver, B)site, C)doc, D)deploy");
        answers.add("B)site");
        
        questions.add(" What does the `mvn -version` command do?");
        options.add("A)It builds your Maven project., B)It installs Maven on your computer., C)It updates Maven to the latest version., D)It print out your installed version of Maven.");
        answers.add("D)It print out your installed version of Maven.");
        
        questions.add(" There are several properties available for use in a pom.xml file that refer to details of the project, such as groupId and version. What do all of these properties start with?");
        options.add("A)pom, B)maven, C)jar, D)project");
        answers.add("D)project");
        
        questions.add(" What directory structure contains the source code of your artifact?");
        options.add("A)src/code, B)src/test/java, C)src/main/java, D)src/main/resources");
        answers.add("C)src/main/java");
        
        questions.add(" Which command is used to run the clean lifecycle followed by verify, install, and package with Maven?");
        options.add("A)`mvn clean install package`, B)`mvn package`, C)`mvn clean verify install package`, D)`mvn install package`");
        answers.add("C)`mvn clean verify install package`");
        
        questions.add(" Which goal would you use with the Dependency plugin to determine which included dependencies are not used, as well as those you are using that you have not defined?");
        options.add("A)`dependency:tree`, B)`dependency:properties`, C)`dependency:evaluate`, D)`dependency:analyze`");
        answers.add("D)`dependency:analyze`");
        
        questions.add(" In a multimodule project, if you have a plugin bound to a phase in the parent, it will be bound to the same phase in the module. What strategy could you employ to prevent the plugin from executing in the module?");
        options.add("A)In the excluded element of the build section of the POM list the plugin you do not want to run., B)Set the phase in the module to none., C)Set a value in the configuration of the plugin in the module to be excluded like this: TRUE., D)Do not specify the plugin in the module.");
        answers.add("C)Set a value in the configuration of the plugin in the module to be excluded like this: TRUE.");
        
        questions.add(" When building a web application with a WAR type project, which project directory should contain the style sheet, JavaScript, and other static file?");
        options.add("A)src/main/static, B)src/main/web, C)src/main/resources, D)src/main/webapp");
        answers.add("D)src/main/webapp");
        
        questions.add(" When performing a build, which Maven plugin will allow you to set the specific version of the artifact to be built without manual modifying the pom.xml file?");
        options.add("A)Compiler, B)Surefire, C)Versions, D)Javadoc");
        answers.add("C)Versions");
        
        questions.add(" When building a Maven Archetype, what is the filepath and file of the archetype descriptor that specifies how to lay out the prototype files?");
        options.add("A)`src/main/template/descriptor.xml`, B)`src/main/resources/META-INF/maven/archetype-descriptor.xml`, C)`src/main/archetype/descriptor.xml`, D)`src/main/resources/META-INF/maven/maven-archetype.xml`");
        answers.add("B)`src/main/resources/META-INF/maven/archetype-descriptor.xml`");
        
        questions.add(" What is a valid packaging type for a Maven project?");
        options.add("A)WAR, B)all of these answers, C)POM, D)EAR");
        answers.add("B)all of these answers");
        
        questions.add(" When two dependencies of your Maven project introduce the same transitive dependency with different versions, which one(s) will be included in the dependency list for your project?");
        options.add("A)the dependency with the higher version, B)the transitive dependency that comes from the dependency listed first in the pom.xml file, C)the transitive dependency that comes from the dependency listed last in the pom.xml file, D)the transitive dependency version of the artifact that is closest to your project");
        answers.add("D)the transitive dependency version of the artifact that is closest to your project");
        
        questions.add(" Many organizations set up local mirrors to the Maven central repository. In order to leverage your company's Maven repository as a proxy for the Maven central repository, which element should you put into the settings.xml file?");
        options.add("A)Replacements, B)Proxies, C)Mirrors, D)LocalRepositories");
        answers.add("D)LocalRepositories");
        
        questions.add(" Which Maven plugin would you leverage to specify the version of the compiler to target as well as the source level of the language?");
        options.add("A)Versions, B)Surefire, C)Target, D)Compiler");
        answers.add("D)Compiler");
        
        questions.add(" If your machine is behind a proxy, where should you specify the proxy server settings in order for Maven to access remote resources?");
        options.add("A)`.m2/proxy.txt`, B)`pom.xml`, C)`proxy.xml`, D)`settings.xml`");
        answers.add("D)`settings.xml`");
        
        questions.add(" What environment variable can you alter to increase the memory Maven uses?");
        options.add("A)MAVEN_OPTS, B)M2_HOME, C)MAVEN_MEMORY, D)PATH");
        answers.add("A)MAVEN_OPTS");
        
        questions.add(" How can you use Maven to run unit tests in parallel?");
        options.add("A)It is not possible to do this., B)Implement the JUnit dependency and add a configuration that sets the parallel element to true., C)Specify the Maven Surefire Plugin and add a configuration that sets the parallel element to true., D)Move each test suite into a separate submodule.");
        answers.add("C)Specify the Maven Surefire Plugin and add a configuration that sets the parallel element to true.");
        
        questions.add(" What will the mvn dependency:tree command do?");
        options.add("A)Verify the dependencies defined in the POM file., B)Print out a report of your project's dependencies in a tree format., C)Download all the transitive dependencies., D)Prune unused dependencies from your dependency tree.");
        answers.add("B)Print out a report of your project's dependencies in a tree format.");
        
        questions.add(" How do you run a single unit test in Maven?");
        options.add("A)Maven runs only a single unit test by default., B)Use the -Dtest= flag and pass in the name of the test., C)Use a plugin that can specify the test you want to run., D)It is not possible to do this.");
        answers.add("B)Use the -Dtest= flag and pass in the name of the test.");
        
        questions.add(" How can Maven profiles be triggered?");
        options.add("A)by explicitly calling the profiles using the -P flag, B)based on environment variables, C)all of these answers, D)through Maven settings");
        answers.add("C)all of these answers");
        
        questions.add(" Why will an mvn install command not deploy any artifacts to a remote repository?");
        options.add("A)The name of the artifact must also be specified in the command., B)The name of the remote repository must also be specified in the command., C)Deploying artifacts to a remote repository must be done manually., D)The deploy phase of the default Maven lifecycle comes after the install phase.");
        answers.add("D)The deploy phase of the default Maven lifecycle comes after the install phase.");
        
        questions.add(" Suppose you want to include a properties file in the JAR generated by your Maven build. What directory should you put it in?");
        options.add("A)`${basedir}/src/main/resources`, B)`${basedir}/src/main/java/resources`, C)`${basedir}/resources`, D)`${basedir}/src/main/properties`");
        answers.add("A)`${basedir}/src/main/resources`");
        
        questions.add(" Which structure in a settings.xml file allows for flexing properties based on some value for the runtime of Maven?");
        options.add("A)Environment, B)Properties, C)Switch, D)Profiles");
        answers.add("D)Profiles");
        
        questions.add(" What does it mean if the scope of a dependency is runtime?");
        options.add("A)The dependency is not required to compile the project but is needed at runtime., B)The dependency is needed at compile time and at runtime and must be packaged for distribution., C)The dependency is needed at compile time and at runtime but does NOT need to be packaged for distribution., D)The dependency is required for compilation.");
        answers.add("A)The dependency is not required to compile the project, but is needed at runtime.");
        
        questions.add(" If you want to utilize a locally developed JAR file in another project and that JAR file has not been deployed to either the Maven central repository or your own locally sourced mirror repository, what Maven goal do you need to execute on the locally developed JAR project?");
        options.add("A)package, B)install, C)compile, D)test");
        answers.add("B)install");
        
        questions.add(" What is the default packaging type for a Maven project build artifact?");
        options.add("A)WAR, B)JAR, C)EAR, D)POM");
        answers.add("B)JAR");
        
        questions.add(" When defining a dependency that is included with the runtime container, what scope do you use in the pom.xml?");
        options.add("A)provided, B)compile, C)execution, D)runtime");
        answers.add("A)provided");
        
        questions.add(" What argument do you pass to Maven in order to update SNAPSHOT from the remote repository?");
        options.add("A)-U, B)-J, C)-X, D)-S");
        answers.add("A)-U");
        
        questions.add(" When performing a release using the Maven release plugin, which environment variable for batch mode is used to define the stamp placed in SCM to indicate the state of the artifact for the actual release?");
        options.add("A)tag, B)scmMark, C)developmentVersion, D)releaseVersion");
        answers.add("D)releaseVersion");
        
        questions.add(" These are two general uses of plugins. The first is build and the second is _____");
        options.add("A)reporting, B)servers, C)dependencies, D)distribution management");
        answers.add("A)reporting");
        
        questions.add(" What does the mvn clean command do?");
        options.add("A)It removes the target directory, B)It updates the version of the plugins defined in the POM file., C)It removes unused dependencies in your project, D)It builds your project");
        answers.add("A)It removes the target directory");
        
        questions.add(" Suppose you are packaging a Maven project and see the following error: ([WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!) What do you add to your POM file to set the platform encoding to ensure your build is not platform dependent?");
        options.add("A)<project.build.resources>, B)<maven.compiler.source>, C)<project.build.sourceEncoding>, D)<project.compiler.encoding>");
        answers.add("C)<project.build.sourceEncoding>");
        
        questions.add(" Why might you not want to include groupId and version elements in child POM files?");
        options.add("A)If you include these elements an error will be thrown when you try to build the project., B)These elements are inherited from the parent POM file and do not need to be repeated., C)Child POM files should include definitions of only dependencies and plugins., D)The values in the parent POM will be overridden by what is defined in the child POM.");
        answers.add("B)These elements are inherited from the parent POM file, and do not need to be repeated.");
        
        questions.add(" The settings.xml file that provides the user-specific settings for Maven is contained in which directory by default?");
        options.add("A)`${maven.home}/${user.name}/settings.xml`, B)`${user.home}/.m2/settings.xml`, C)`${maven.home}/conf/settings.xml`, D)`${user.home}/maven/settings.xml`");
        answers.add("B)`${user.home}/.m2/settings.xml`");
        
        questions.add(" Suppose you are using Maven in a corporate environment and, to save bandwidth, you want to prevent the need for large numbers of developers to download the same dependency from the internet. What do you do to limit this?");
        options.add("A)Create an internal corporate repository to store copies of the necessary artifacts., B)It is not possible to do this., C)When defining the dependency set the scope to provided., D)Each developer should define the dependency in the POM file in the local copy of the project.");
        answers.add("A)Create an internal corporate repository to store copies of the necessary artifacts.");
        
        questions.add(" In multimodule projects, what do child POMs inherit from the parent POM?");
        options.add("A)all of these answers, B)dependencies, C)groupId, D)version");
        answers.add("A)all of these answers");
        
        questions.add(" Which build plugin allows you to create a (fat) JAR file that contains all of the dependencies in the final JAR file?");
        options.add("A)Fatjar, B)Shade, C)Dependency, D)Package");
        answers.add("B)Shade");
        
        questions.add(" What is the default scope for Maven dependencies?");
        options.add("A)Test, B)Compile, C)Runtime, D)Build");
        answers.add("B)Compile");
        
        questions.add(" How many times is compiler:compile called when executing mvn clean compile test package?");
        options.add("A)one, B)two, C)none, D)three");
        answers.add("B)two");
        
        questions.add(" What is one of the advantages of using properties in Maven?");
        options.add("A)Properties provide a template for you to build Maven projects with a certain structure., B)Properties allow you to inherit values from the parent POM in the child POM., C)You can avoid hard-coding values in multiple places., D)Properties speed up your Maven build.");
        answers.add("C)You can avoid hard-coding values in multiple places.");
        
        questions.add(" What are the phases of the clean lifecycle?");
        options.add("A)pre-clean clean and post-clean, B)Compile clean and install, C)clean and install, D)validate clean and deploy");
        answers.add("A)pre-clean, clean and post-clean");
        
        questions.add(" A compile-time dependency of a dependency for your project is often called **a______** dependency.");
        options.add("A)Transitive, B)runtime, C)provided, D)test");
        answers.add("A)Transitive");
        
        questions.add(" For what purpose can plugins use the validate phase in the default lifecycle?");
        options.add("A)to check the parent POM file defines all of the child POM files, B)to carry out checks before building the project, C)to ensure plugins defined in the POM file are in the correct order, D)to check the project structure is correct after building a project");
        answers.add("B)to carry out checks before building the project");
        
        questions.add(" How do you check for unused dependencies in your project?");
        options.add("A)Run mvn clean and look at which plugins are not mentioned in the output., B)You will need to do this manually., C)Include the Maven dependency plugin in your POM file and run the unpack goal., D)Run the analyze goal of the dependency plugin.");
        answers.add("D)Run the analyze goal of the dependency plugin.");
        
        questions.add(" Why is it best practice to avoid overriding the default directory structure?");
        options.add("A)Keeping the default structure reduces onboarding time because developers recognize it., B)Overriding the default structure is very complex., C)Overriding the default structure will cause Maven to take longer to compile your code., D)all of these answers");
        answers.add("D)all of these answers");
        
        questions.add(" What is the main purpose of the install phase?");
        options.add("A)to compile the source code of the project, B)to install all of the remote dependencies, C)to deploy the final project artifacts into a remote Maven repository, D)to copy the final project artifacts into the local Maven repository");
        answers.add("D)to copy the final project artifacts into the local Maven repository");
        
        questions.add(" How do you skip the tests when running a mvn package command?");
        options.add("A)Use -Dtest=skip, B)Use -DskipTests=true, C)Use -Dtests=pass, D)Use a plugin that can be configured to skip tests");
        answers.add("B)Use -DskipTests=true");
        
        questions.add(" What is the default value of the warSourceDirectory configuration property of the Maven WAR Plugin?");
        options.add("A)/src/main/webapp, B)/src/main/war, C)/src/main/WEB-INF, D)/src/web");
        answers.add("C)/src/main/WEB-INF");
        
        questions.add(" When building a Maven Archetype, where do you put your prototype files?");
        options.add("A)src/main/template, B)src/main/archetype, C)src/main/resources/archetype-resources, D)src/main/java");
        answers.add("C)src/main/resources/archetype-resources");
        
        questions.add(" The primary purpose of Apache Maven is to provide uniform, easy, and standardized ____.");
        options.add("A)versioning, B)project structure, C)source code style, D)builds");
        answers.add("D)builds");
        
        questions.add(" How do you generate a site for a project with Maven?");
        options.add("A)Use the mvn site command., B)Use the mvn install command., C)This is not possible., D)Use the mvn package command.");
        answers.add("A)Use the mvn site command.");
        
        questions.add(" What is the default location of the local Maven repository?");
        options.add("A)USER_HOME/.m2/repository, B)USER_HOME/.m2/local, C)USER_HOME/maven/repository, D)/repo");
        answers.add("A)USER_HOME/.m2/repository");
        
        questions.add(" A phase is a step in ____.");
        options.add("A)the compile goal, B)the development process, C)the build lifecycle, D)the POM file");
        answers.add("C)the build lifecycle");
        
        questions.add(" What is the Maven central repository?");
        options.add("A)a local repository created by Maven in your local file system, B)a repository in the middle of your Maven project, C)an online repository for open-source binaries, D)a repository that you must download to build a Maven project");
        answers.add("C)an online repository for open-source binaries");
        
        questions.add(" What are the artifacts that Apache Maven uses to perform its build operations?");
        options.add("A)ant files, B)properties, C)dependencies, D)plugins");
        answers.add("D)plugins");
        
        questions.add(" Which plugin is used to copy, filter, include, and exclude non-Java files into your final project?");
        options.add("A)Build, B)Files, C)Copy, D)Resources");
        answers.add("D)Resources");
        
        questions.add(" What is a module in a Maven project?");
        options.add("A)a dependency, B)a subproject or child project, C)a Java package, D)a plugin");
        answers.add("B)a subproject, or child project");
        
        questions.add(" What does the mvn --version command do?");
        options.add("A)It updates Maven to the latest version., B)It prints out your installed version of Maven., C)It builds your Maven project., D)It installs Maven on your computer.");
        answers.add("B)It prints out your installed version of Maven.");
        
        questions.add(" When building a Maven project, where are Maven dependencies stored?");
        options.add("A)in the target directory, B)in your local repository, C)in the POM file, D)online in the Maven central repository");
        answers.add("B)in your local repository");
        
        questions.add(" Why is it best practice not to release SNAPSHOT versions of Maven artifacts to production?");
        options.add("A)A release marked with SNAPSHOT indicates that not all of the tests have passed., B)A SNAPSHOT can be hard to reproduce making it difficult to determine the cause of an issue., C)SNAPSHOT releases do not contain any dependencies., D)A release marked with SNAPSHOT may contain sensitive security information.");
        answers.add("B)A SNAPSHOT can be hard to reproduce, making it difficult to determine the cause of an issue.");
        
        questions.add(" Why do you use Maven Wrapper on a project shared with a large team of developers?");
        options.add("A)all of these answers, B)All developers will be using the same Maven version providing stability., C)The dependencies for the project will be downloaded only once for all developers saving bandwidth., D)Maven Wrapper checks dependencies for vulnerabilities increasing security.");
        answers.add("B)All developers will be using the same Maven version, providing stability.");
        
        questions.add(" What command can you use to run the goal of the compiler plugin?");
        options.add("A)mvn compiler:compile, B)mvn compiler, C)mvn test-compile, D)mvn compiler:test");
        answers.add("A)mvn compiler:compile");
        
        questions.add(" In order to leverage a single execution of an Apache Maven goal on a multimodule project, from which directory should you execute the goal?");
        options.add("A)the directory with the parent POM, B)the workspace directory, C)the development directory, D)the module directory");
        answers.add("A)the directory with the parent POM");
        
    }

    public static void main(String[] args) {
        new Maven_Quiz(name).setVisible(true);
    }
    
}
