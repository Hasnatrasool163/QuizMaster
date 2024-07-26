package tenthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Django_Quiz extends Quiz {

    public Django_Quiz(String name) {
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

    // 20
    @Override
    public final void loadQuestions() {

        questions.add("What command is used to start a new Django project?");
        options.add("A) django startproject, B) django createproject, C) django newproject, D) django initproject");
        answers.add("A) django startproject");

        questions.add("Which of the following is the default database used by Django?");
        options.add("A) MySQL, B) SQLite, C) PostgreSQL, D) MongoDB");
        answers.add("B) SQLite");

        questions.add("What command is used to create a new Django application within a project?");
        options.add("A) django startapp, B) django createapp, C) django newapp, D) django initapp");
        answers.add("A) django startapp");

        questions.add("Which Django template tag is used to extend a base template?");
        options.add("A) {% extends %}, B) {% include %}, C) {% block %}, D) {% template %}");
        answers.add("A) {% extends %}");

        questions.add("In Django, what is the purpose of the manage.py file?");
        options.add("A) To manage virtual environments, B) To manage database migrations, C) To manage Django commands, D) To manage static files");
        answers.add("C) To manage Django commands");

        questions.add("Which authentication model is provided by default in Django?");
        options.add("A) OAuth, B) JWT, C) Basic Authentication, D) Django Authentication");
        answers.add("D) Django Authentication");

        questions.add("What is the primary function of Django's views.py file?");
        options.add("A) Define models, B) Define URLs, C) Define templates, D) Define view functions");
        answers.add("D) Define view functions");

        questions.add("Which command is used to apply database migrations in Django?");
        options.add("A) python manage.py migrate, B) python manage.py applymigrations, C) python manage.py makemigrations, D) python manage.py dbmigrate");
        answers.add("A) python manage.py migrate");

        questions.add("What is the purpose of Django's settings.py file?");
        options.add("A) To define project-specific settings, B) To define database tables, C) To define URL patterns, D) To define template tags");
        answers.add("A) To define project-specific settings");

        questions.add("Which Django admin feature allows customization of the admin interface?");
        options.add("A) admin.py, B) admin.site.register, C) admin.ModelAdmin, D) admin.site.urls");
        answers.add("C) admin.ModelAdmin");

        questions.add("Which Django command is used to run the development server?");
        options.add("A) python runserver, B) django server, C) python manage.py runserver, D) django start");
        answers.add("C) python manage.py runserver");

        questions.add("What is the default URL pattern in Django for the admin interface?");
        options.add("A) /admin/, B) /admin-panel/, C) /dashboard/, D) /admin-dashboard/");
        answers.add("A) /admin/");

        questions.add("Which database engine does Django support natively?");
        options.add("A) MongoDB, B) SQLite, C) Redis, D) Cassandra");
        answers.add("B) SQLite");

        questions.add("What does the Django command 'python manage.py createsuperuser' do?");
        options.add("A) Creates a new Django project, B) Creates a new Django app, C) Creates a new superuser for the admin, D) Creates a new database table");
        answers.add("C) Creates a new superuser for the admin");

        questions.add("In Django models, what does 'CharField' represent?");
        options.add("A) Integer field, B) String field, C) Boolean field, D) Date field");
        answers.add("B) String field");
//
        questions.add("What is the purpose of Django's 'django.contrib' package?");
        options.add("A) Provides core Django functionalities, B) Provides third-party Django apps, C) Provides admin interface customization, D) Provides Django REST framework");
        answers.add("A) Provides core Django functionalities");

        questions.add("Which Django command is used to create database migrations?");
        options.add("A) python manage.py makemigrations, B) python manage.py createmigrations, C) python manage.py dbmigrate, D) python migrate");
        answers.add("A) python manage.py makemigrations");

        questions.add("What does the Django ORM stand for?");
        options.add("A) Object-Relational Model, B) Object-Relation Mapper, C) Object-Relational Mapping, D) Object-Relation Module");
        answers.add("C) Object-Relational Mapping");

        questions.add("Which Django template tag is used to define content blocks?");
        options.add("A) {% content %}, B) {% define %}, C) {% block %}, D) {% extend %}");
        answers.add("C) {% block %}");

        questions.add("What is the purpose of Django's 'context' parameter in views?");
        options.add("A) To define URL patterns, B) To pass data to templates, C) To manage database connections, D) To define view functions");
        answers.add("B) To pass data to templates");

        questions.add("To cache your entire site for an application in Django, you add all except which of these settings?");
        options.add("A) django.middleware.common.CommonMiddleware, B) django.middleware.cache.UpdateCacheMiddleware, C) django.middleware.cache.FetchFromCacheMiddleware, D) django.middleware.cache.AcceleratedCacheMiddleware");
        answers.add("D) django.middleware.cache.AcceleratedCacheMiddleware");

        questions.add("In which programming language is Django written?");
        options.add("A) C++, B) Java, C) Python, D) Ruby");
        answers.add("C) Python");

        questions.add("To automatically provide a value for a field, or to do validation that requires access to more than a single field, you should override the ___ method in the ___ class.");
        options.add("A) clean(); Field, B) group(); Model, C) validate(); Form, D) validate(); Model");
        answers.add("A) clean(); Field");

        questions.add("How do you determine at startup time if a piece of middleware should be used?");
        options.add("A) Raise MiddlewareNotUsed in the init function of your middleware., B) Implement the not_used method in your middleware class., C) List the middleware beneath an entry of django.middleware.IgnoredMiddleware., D) Write code to remove the middleware from the settings in [app]/init.py.");
        answers.add("A) Raise MiddlewareNotUsed in the init function of your middleware.");

        questions.add("Which step would NOT help you troubleshoot the error 'django-admin: command not found'?");
        options.add("A) Check that the bin folder inside your Django directory is on your system path., B) Make sure you have activated the virtual environment you have set up containing Django., C) Check that you have installed Django., D) Make sure that you have created a Django project.");
        answers.add("D) Make sure that you have created a Django project.");

        questions.add("Every time a user is saved, their quiz_score needs to be recalculated. Where might be an ideal place to add this logic?");
        options.add("A) model, B) template, C) database, D) view");
        answers.add("A) model");

        questions.add("What is the correct way to begin a class called 'Rainbow' in Python?");
        options.add("A) Rainbow {}, B) export Rainbow:, C) class Rainbow:, D) def Rainbow:");
        answers.add("C) class Rainbow:");

        questions.add("You have inherited a Django project and need to get it running locally. It comes with a requirements.txt file containing all its dependencies. Which command should you use?");
        options.add("A) django-admin startproject requirements.txt, B) python install -r requirements.txt, C) pip install -r requirements.txt, D) pip install Django");
        answers.add("C) pip install -r requirements.txt");

        questions.add("Which best practice is NOT relevant to migrations?");
        options.add("A) To make sure that your migrations are up to date you should run updatemigrations before running your tests., B) You should back up your production database before running a migration., C) Your migration code should be under source control., D) If a project has a lot of data you should test against a staging copy before running the migration on production.");
        answers.add("A) To make sure that your migrations are up to date you should run updatemigrations before running your tests.");

        questions.add("What will this URL pattern match? url(r'^$', views.hello)");
        options.add("A) a string beginning with the letter R, B) an empty string at the server root, C) a string containing ^ and $, D) an empty string anywhere in the URL");
        answers.add("B) an empty string at the server root");

    }

    public static void main(String[] args) {
        new Django_Quiz(name).setVisible(true);
    }

}

//questions.add(" To cache your entire site for an application in Django, you add all except which of these settings?");
//options.add("A)   django.middleware.common.CommonMiddleware, B)    django.middleware.cache.UpdateCacheMiddleware, C)    django.middleware.cache.FetchFromCacheMiddleware, D)   django.middleware.cache.AcceleratedCacheMiddleware");
//answers.add("A) django.middleware.cache.AcceleratedCacheMiddleware");
//
//questions.add(" In which programming language is Django written?");
//options.add("A)   C++, B)    Java, C)   Python, D)    Ruby");
//answers.add("A) Python");
//
//questions.add(" To automatically provide a value for a field, or to do validation that requires access to more than a single field, you should override the `___` method in the `___` class.");
//options.add("A)   validate(); Model, B)    group(); Model, C)    validate(); Form, D)   clean(); Field");
//answers.add("A) clean(); Field");
//
//questions.add(" How do you determine at startup time if a piece of middleware should be used?");
//options.add("A)  Raise MiddlewareNotUsed in the **init** function of your middleware., B)    Implement the not_used method in your middleware class., C)    List the middleware beneath an entry of django.middleware.IgnoredMiddleware., D)    Write code to remove the middleware from the settings in [app]/**init**.py.");
//answers.add("A) Raise MiddlewareNotUsed in the **init** function of your middleware.");
//
//questions.add(" Which step would NOT help you troubleshoot the error "django-admin: command not found"?");
//options.add("A)   Check that the bin folder inside your Django directory is on your system path., B)    Make sure you have activated the virtual environment you have set up containing Django., C)    Check that you have installed Django., D)   Make sure that you have created a Django project.");
//answers.add("A) Make sure that you have created a Django project.");
//
//questions.add(" Every time a user is saved, their quiz_score needs to be recalculated. Where might be an ideal place to add this logic?");
//options.add("A)   template, B)   model, C)    database, D)    view");
//answers.add("A) model");
//
//questions.add(" What is the correct way to begin a class called "Rainbow" in Python?");
//options.add("A)   Rainbow {}, B)    export Rainbow:, C)   class Rainbow:, D)    def Rainbow:");
//answers.add("A) class Rainbow:");
//
//questions.add(" You have inherited a Django project and need to get it running locally. It comes with a requirements.txt file containing all its dependencies. Which command should you use?");
//options.add("A)   django-admin startproject requirements.txt, B)    python install -r requirements.txt, C)   pip install -r requirements.txt, D)    pip install Django");
//answers.add("A) pip install -r requirements.txt");
//
//questions.add(" Which best practice is NOT relevant to migrations?");
//options.add("A)  To make sure that your migrations are up to date you should run updatemigrations before running your tests., B)    You should back up your production database before running a migration., C)    Your migration code should be under source control., D)    If a project has a lot of data you should test against a staging copy before running the migration on production.");
//answers.add("A) To make sure that your migrations are up to date, you should run updatemigrations before running your tests.");
//
//questions.add(" What will this URL pattern match? url(r'^\$', views.hello)");
//options.add("A)   a string beginning with the letter Ra string beginning with the letter R, B)   an empty string at the server root, C)    a string containing ^ and $a string containing ^ and $, D)    an empty string anywhere in the URLan empty string anywhere in the URL");
//answers.add("A) an empty string at the server root");
//
//questions.add(" What is the typical order of an HTTP request/response cycle in Django?");
//options.add("A)  URL > view > template, B)    form > model > view, C)    template > view > model, D)    URL > template > view > model");
//answers.add("A) URL > view > template");
//
//questions.add(" Django's class-based generic views provide which classes that implement common web development tasks?");
//options.add("A)   concrete, B)    thread-safe, C)   abstract, D)    dynamic");
//answers.add("A) abstract");
//
//questions.add(" Which skills do you need to maintain a set of Django templates?");
//options.add("A)   template syntax, B)   HTML and template syntax, C)    Python HTML and template syntax, D)    Python and template syntax");
//answers.add("A) HTML and template syntax");
//
//questions.add(" Which is NOT a valid step in configuring your Django 2.x instance to serve up static files such as images or CSS?");
//options.add("A)  In your urls file add a pattern that includes the name of your static directory., B)    Create a directory named static inside your app directory., C)    Create a directory named after the app under the static directory and place static files inside., D)    Use the template tag {percentage mark load static percentage mark}.");
//answers.add("A) In your urls file, add a pattern that includes the name of your static directory.");
//
//questions.add(" What is the correct way to make a variable available to all of your templates?");
//options.add("A)   Set a session variable., B)    Use a global variable., C)    Add a dictionary to the template context., D)   Use RequestContext.");
//answers.add("A) Use RequestContext.");
//
//questions.add(" You want to create a page that allows editing of two classes connected by a foreign key (e.g., a question and answer that reside in separate tables). What Django feature can you use?");
//options.add("A)  actions, B)    admin, C)    mezcal, D)    inlines");
//answers.add("A) actions");
//
//questions.add(" Why are QuerySets considered "lazy"?");
//options.add("A)   The results of a QuerySet are not ordered., B)   QuerySets do not create any database activity until they are evaluated., C)    QuerySets do not load objects into memory until they are needed., D)    Using QuerySets you cannot execute more complex queries.");
//answers.add("A) QuerySets do not create any database activity until they are evaluated.");
//
//questions.add(" You receive a `MultiValueDictKeyError` when trying to access a request parameter with the following code: request.GET['search_term']. Which solution will NOT help you in this scenario?");
//options.add("A)  Switch to using POST instead of GET as the request method., B)    Make sure the input field in your form is also named "search_term"., C)    Use MultiValueDict's GET method instead of hitting the dictionary directly like this: request.GET.get('search_term' '')., D)    Check if the search_term parameter is present in the request before attempting to access it.");
//answers.add("A) Switch to using POST instead of GET as the request method.");
//
//questions.add(" Which function of Django's Form class will render a form's fields as a series of <p> tags?");
//options.add("A)   show_fields(), B)   as_p(), C)    as_table(), D)    fields()");
//answers.add("A) as_p()");
//
//questions.add(" You have found a bug in Django and you want to submit a patch. Which is the correct procedure?");
//options.add("A)   Fork the Django repository GitHub., B)    Submit a pull request., C)   all of these answers., D)    Run Django's test suite.");
//answers.add("A) all of these answers.");
//
//questions.add(" Django supplies sensible default values for settings. In which Python module can you find these settings?");
//options.add("A)   `django.utils.default_settings.py`, B)    `django.utils.global_settings.py`, C)    `django.conf.default_settings.py`, D)   `django.conf.global_settings.py`");
//answers.add("A) `django.conf.global_settings.py`");
//
//questions.add(" Which variable name is best according to PEP 8 guidelines?");
//options.add("A)   numFingers, B)    number-of-Fingers, C)   number_of_fingers, D)    finger_num");
//answers.add("A) number_of_fingers");
//
//questions.add(" A project has accumulated 500 migrations. Which course of action would you pursue?");
//options.add("A)   Manually merge your migration files to reduce the number, B)    Don't worry about the number, C)    Try to minimize the number of migrations, D)   Use squashmigrations to reduce the number");
//answers.add("A) Use squashmigrations to reduce the number");
//
//questions.add(" What does an F() object allow you when dealing with models?");
//options.add("A)  perform db operations without fetching a model object, B)    define db transaction isolation levels, C)    use aggregate functions more easily, D)    build reusable QuerySets");
//answers.add("A) perform db operations without fetching a model object");
//
//questions.add(" Which is not a Django field type for holding integers?");
//options.add("A)   SmallIntegerField, B)   NegativeIntegerField, C)    BigAutoField, D)    PositiveIntegerField");
//answers.add("A) NegativeIntegerField");
//
//questions.add(" Which will show the currently installed version?");
//options.add("A)   print (django.version), B)    import django django.getVersion(), C)   import django django.get_version(), D)    python -c django --version");
//answers.add("A) import django django.get_version()");
//
//questions.add(" You should use the http method `___` to read data and `___` to update or create data");
//options.add("A)   READ; WRITE, B)   GET; POST, C)    POST; GET, D)    GET; PATCH");
//answers.add("A) GET; POST");
//
//questions.add(" When should you employ the POST method over GET for submitting data?");
//options.add("A)   when efficiency is important, B)    when you want the data to be cached, C)    when you want to use your browser to help with debugging, D)   when the data in the form may be sensitive");
//answers.add("A) when the data in the form may be sensitive");
//
//questions.add(" When to use the Django sites framework?");
//options.add("A)  if your single installation powers more than one site, B)    if you need to serve static as well as dynamic content, C)    if you want your app have a fully qualified domain name, D)    if you are expecting more than 10.000 users");
//answers.add("A) if your single installation powers more than one site");
//
//questions.add(" Which infrastructure do you need: `title=models.charfield(max_length=100, validators=[validate_spelling])`");
//options.add("A)   inizialized array called validators, B)   a validators file containing a function called validate_spelling imported at the top of model, C)    a validators file containing a function called validate imported at the top of model, D)    spelling package imported at the top of model");
//answers.add("A) a validators file containing a function called validate_spelling imported at the top of model");
//
//questions.add(" What decorator is used to require that a view accepts only the get and head methods?");
//options.add("A)  require_safe(), B)    require_put(), C)    require_post(), D)    require_get()");
//answers.add("A) require_safe()");
//
//questions.add(" What is a callable that takes a value and raises an error if the value fails?");
//options.add("A)  validator, B)    deodorizer, C)    mediator, D)    regular expression");
//answers.add("A) validator");
//
//questions.add(" To secure an API endpoint, making it accessible to registered users only, you can replace the rest_framework.permissions.allowAny value in the default_permissions section of your settings.py to");
//options.add("A)   rest_framework.permissions.IsAdminUser, B)   rest_framework.permissions.IsAuthenticated, C)    rest_framework.permissions.IsAuthorized, D)    rest_framework.permissions.IsRegistered");
//answers.add("A) rest_framework.permissions.IsAuthenticated");
//
//questions.add(" Which command would you use to apply a migration?");
//options.add("A)   makemigration, B)    update_db, C)    applymigration, D)   migrate");
//answers.add("A) migrate");
//
//questions.add(" Which type of class allows QuerySets and model instances to be converted to native Python data types for use in APIs?");
//options.add("A)   objectwriters, B)   serializers, C)    picklers, D)    viewsets");
//answers.add("A) serializers");
//
//questions.add(" How should the code end? python \n{ percentage if spark >= 50 percentage }Lots of spark \n{percentage elif spark == 42 percentage}");
//options.add("A) , B)    { percentage else percentage}, C)   {percentage endif percentage}, D)    Nothing needed");
//answers.add("A) {percentage endif percentage}");
//
//questions.add(" Which class allows you to automatically create a Serializer class with fields and validators that correspond to your model's fields?");
//options.add("A)  ModelSerializer, B)    Model, C)    DataSerializer, D)    ModelToSerializer");
//answers.add("A) ModelSerializer");
//
//questions.add(" Which command to access the built-in admin tool for the first time?");
//options.add("A)   django-admin setup, B)    django-admin runserver, C)    python manage.py createuser, D)   python manage.py createsuperuser");
//answers.add("A) python manage.py createsuperuser");
//
//questions.add(" Virtual environments are for managing dependencies. Which granularity works best?");
//options.add("A)  you should set up a new virtualenv for each Django project, B)    They should not be used, C)    Use the same venv for all your Django work, D)    Use a new venv for each Django app");
//answers.add("A) you should set up a new virtualenv for each Django project");
//
//questions.add(" What executes various Django commands such as running a webserver or creating an app?");
//options.add("A)   migrate.py, B)    wsgi.py, C)   manage.py, D)    runserver");
//answers.add("A) manage.py");
//
//questions.add(" What do Django best practice suggest should be "fat"?");
//options.add("A)  models, B)    controllers, C)    programmers, D)    clients");
//answers.add("A) models");
//
//questions.add(" Which is not part of Django's design philosophy?");
//options.add("A)   Loose Coupling, B)    Less Code, C)    Fast Development, D)   Implicit over explicit");
//answers.add("A) Implicit over explicit");
//
//questions.add(" What is the result of this template code? {{"live long and prosper"|truncatewords:3}}");
//options.add("A)  live long and ..., B)    live long and, C)    a compilation error, D)    liv");
//answers.add("A) live long and ...");
//
//questions.add(" You are building a web application using a React front end and a Django back end. For what will you need to provision?\*\*");
//options.add("A)   an NGINX web server, B)    a NoSQL database, C)    a larger hard drive, D)   CORS middleware");
//answers.add("A) CORS middleware");
//
//questions.add(" To expose an existing model via an API endpoint, what do you need to implement?\*\*");
//options.add("A)   an HTTP request, B)    a JSON object, C)    a query, D)   a serializer");
//answers.add("A) a serializer");
//
//questions.add(" How would you stop Django from performing database table creation or deletion operations via migrations for a particular model?");
//options.add("A)   Run the `migrate` command with `--exclude=[model_name]`., B)    Move the model definition from `models.py` into its own file., C)   Set `managed=False` inside the model., D)    Don't run the `migrate` command.");
//answers.add("A) Set `managed=False` inside the model.");
//
//questions.add(" what method can you use to check if form data has changed when using a form instance?");
//options.add("A)  has_changed(), B)    its_changed(), C)    has_updated(), D)    None of This");
//answers.add("A) has_changed()");
//
//questions.add(" What is WSGI?");
//options.add("A)   a server, B)   an interface specifications, C)    a Python module, D)    a framework");
//answers.add("A) an interface specifications");
//
//questions.add(" Which generic view should be used for displaying the titles of all Django Reinhardt's songs?");
//options.add("A)   DetailView, B)    TittleView, C)    SongView, D)   ListView");
//answers.add("A) ListView");
//
//questions.add(" Which statement is most accurate, regarding using the default SQLite database on your local/development machine but Postgres in production");
//options.add("A)  There's less chance of introducing bugs since SQLite already works out the box, B)    It's fine you just need to keep both instances synchronized, C)    It's a bad idea and could lead to issues down the road, D)    It's the most efficient way to build a project");
//answers.add("A) There's less chance of introducing bugs since SQLite already works out the box");
//
//questions.add(" Why might you want to write a custom model Manager?");
//options.add("A)   to perform database queries, B)    to set up a database for testing, C)   to modify the initial QuerySet that the Manager returns, D)    to filter the results that a database query returns");
//answers.add("A) to modify the initial QuerySet that the Manager returns");
//
//questions.add(" In Django, what are used to customize the data that is sent to the templates?");
//options.add("A)   models, B)   views, C)    forms, D)    serializers");
//answers.add("A) views");
//
//questions.add(" When should you employ the POST method over the GET method for submitting data from a form?");
//options.add("A)  when the data in the form may be sensitive, B)    when you want the data to be cached, C)    when you want to use your browser to help with debugging, D)    when efficiency is important");
//answers.add("A) when the data in the form may be sensitive");
//
//questions.add(" What is a callable that takes a value and raises an error if the value fails to meet some criteria?");
//options.add("A)   mediator, B)   validator, C)    regular expression, D)    deodorizer");
//answers.add("A) validator");
//
//questions.add(" You are uploading a file to Django from a form and you want to save the received file as a field on a model object. You can simply assign the file object from**\_to a field of type\_\_**in the model.");
//options.add("A)   request.META; FileField, B)    request.FILES; BLOBField, C)   request.FILES; FileField, D)    request.META.Files; CLOBField");
//answers.add("A) request.FILES; FileField");
//
//questions.add(" What python module might be used to store the current state of a Django model in a file?");
//options.add("A)  pickle, B)    struct, C)    marshal, D)    serialize");
//answers.add("A) pickle");
//
//questions.add(" To add a new app to an existing Django project, you must edit the **_ section of the _** file.");
//options.add("A)   ALLOWED_HOSTS; settings.py, B)    APPS; manage.py, C)   INSTALLED_APPS; settings.py, D)    TEMPLATES; urls.py");
//answers.add("A) INSTALLED_APPS; settings.py");
//
//questions.add(" Which is not a third-party package commonly used for authentication?");
//options.add("A)   django-guardian, B)    django-rest-auth, C)    authtoken, D)   django-rest-framework-jwt");
//answers.add("A) django-rest-framework-jwt");
//
//questions.add(" Which function in the django.urls package can help you avoid hardcoding URLS by generating a URL given the name of a view?");
//options.add("A)   get_script_prefix(), B)    redirect(), C)   reverse(), D)    resolve()");
//answers.add("A) reverse()");
//
//questions.add(" Which is Fictional HTTP request method?");
//options.add("A)   POST, B)    PUT, C)   PAUSE, D)    PATCH");
//answers.add("A) PAUSE");
//
//questions.add(" Which helper function is not provided as a part of django.shortcuts package? ref-");
//options.add("A)  render_to_request(), B)    render(), C)    redirect(), D)    get_object_or_404()");
//answers.add("A) render_to_request()");
//
//questions.add(" Which is a nonstandard place to store templates?");
//options.add("A)  at the root level of a project, B)    inside the application, C)    in the database, D)    on Github");
//answers.add("A) at the root level of a project");
//
//questions.add(" If you left the 8080 off the command python manage.py runserver 8080 what port would Django use as default?");
//options.add("A)  8080, B)    80, C)    8000, D)    It would fail to start");
//answers.add("A) 8080");
//
//questions.add(" Which statement about Django apps is false?");
//options.add("A)  A Django app is the top-level container for a web application powered by Django., B)    Django apps are small libraries designed to represent a single aspect of a project., C)    Each Django app should do one thing and one thing alone., D)    A Django project is made up of many apps.");
//answers.add("A) A Django app is the top-level container for a web application powered by Django.");
//
//questions.add(" Which characters are illegal in template variable names?");
//options.add("A)   underscores., B)    uppercase letters., C)   punctuation marks ., D)    numbers.");
//answers.add("A) punctuation marks .");
//
//questions.add(" Which is not a valid closing template tag?");
//options.add("A)   `% endautoescape %`, B)   `% endifempty %`, C)    `% endcomment %`, D)    `% endfilter %`");
//answers.add("A) `% endifempty %`");
//
//questions.add(" When would you need to use the reverse_lazy utility function instead of reverse?");
//options.add("A)   when you want to provide a reverse URL as a default value for a parameter in a function's signature, B)   all of the these answers, C)    when you want to provide a reverse URL as the url attribute of a class-based generic view, D)    when you want to provide a URL to a decorator such as the login_url argument for the permission_required() decorator");
//answers.add("A) all of the these answers");
//
//questions.add(" What is the purpose of the \_\_init\_\_.py file?");
//options.add("A)   to extend the set of modules found in a package, B)    to allow compiled modules from different releases and different versions of Python to coexist, C)    to initialize project settings, D)   to declare the directory contents as a Python module");
//answers.add("A) to declare the directory contents as a Python module");
//
//questions.add(" What python package can be used to edit numbers into more readable form like "1200000" to "1.2 million"?");
//options.add("A)   black, B)    puffer, C)    pitch, D)   humanize");
//answers.add("A) humanize");
//
//questions.add(" Where would you find the settings.py file?");
//options.add("A)  \[projectname\]/settings.py, B)    \[projectname\]/\[projectname\]/settings.py, C)    \[PYTHON_ROOT\]/settings.py, D)    \[DJANGO_ROOT]/settings.py");
//answers.add("A) \[projectname\]/settings.py");
//
//questions.add(" What method can you use to check if form data has been changed when using a Form instance?");
//options.add("A)  changed_data(), B)    has changed(), C)    has_updated(), D)    is_modified()");
//answers.add("A) changed_data()");
//
//questions.add(" Which statement is most accurate, regarding using the default SQLite database on your local/development machine but Postgres in production?");
//options.add("A)   It's the most efficient way to build a project, B)    There's less chance of introducing bugs since SQLite already works out of the box, C)    It's a bad idea and could lead to issues down the road, D)   It's fine you just need to keep both instances synchronized");
//answers.add("A) It's fine, you just need to keep both instances synchronized");
//
//questions.add(" How does Django handle URL routing?");
//options.add("A)   by using classes, B)    by using functiones, C)   by using regular expressions, D)    by using fixed path");
//answers.add("A) by using regular expressions");
//
//questions.add(" What is the purpose of Django's middleware?");
//options.add("A)   To define the database schema, B)    To manage URL routing, C)   To handle HTTP requests and responses globally, D)    To create user interfaces");
//answers.add("A) To handle HTTP requests and responses globally");
//
//questions.add(" Which of the following is true about Django's Object-Relational Mapping (ORM)?");
//options.add("A)   It's used to define URL routing in a Django application., B)   It allows you to query the database using Python code., C)    It's used to define the structure of HTML templates., D)    It's responsible for managing user authentication.");
//answers.add("A) It allows you to query the database using Python code.");
//
//questions.add(" Which of the following is true about Django's "many-to-many" field in a model?");
//options.add("A)   It's used to define a one-to-one relationship between two models., B)    It creates a foreign key relationship between two models., C)   It allows multiple objects to be associated with each other., D)    It enforces unique constraints on a field.");
//answers.add("A) It allows multiple objects to be associated with each other.");
//
//questions.add(" Django's class-based generic views provide which classes that implement common web development tasks?");
//options.add("A)   concrete, B)    thread-safe, C)   abstract, D)    dynamic");
//answers.add("A) abstract");
//
//questions.add(" Which skills do you need to maintain a set of Django templates?");
//options.add("A)   template syntax, B)   HTML and template syntax, C)    Python HTML and template syntax, D)    Python and template syntax");
//answers.add("A) HTML and template syntax");
//
//questions.add(" Which is a nonstandard place to store templates?");
//options.add("A)  at the root level of a project, B)    inside the application, C)    in the database, D)    on Github");
//answers.add("A) at the root level of a project");
//
//questions.add(" If you left the 8080 off the command python manage.py runserver 8080 what port would Django use as default?");
//options.add("A)  8080, B)    80, C)    8000, D)    It would fail to start");
//answers.add("A) 8080");
//
//questions.add(" What is the purpose of Django's Object-Relational Mapping (ORM)?");
//options.add("A)   To define URL routing in a Django application., B)    To handle HTTP requests and responses globally., C)   To map Python objects to database tables and simplify database operations., D)    To create user interfaces.");
//answers.add("A) To map Python objects to database tables and simplify database operations.");
//
//questions.add(" In Django, what does the term "migration" refer to?");
//options.add("A)   A change in URL routing configuration., B)   The process of propagating changes you make to your models (adding a field deleting a model etc.) into your database schema., C)    A way to define custom middleware., D)    The process of creating HTML templates for your application.");
//answers.add("A) The process of propagating changes you make to your models (adding a field, deleting a model, etc.) into your database schema.");
//
//questions.add(" What is the purpose of Django's "context" in the context of rendering templates?");
//options.add("A)  To pass data from your views to your templates so that the data can be rendered dynamically., B)    To define URL patterns for your application., C)    To manage HTTP requests and responses., D)    To create user interfaces.");
//answers.add("A) To pass data from your views to your templates so that the data can be rendered dynamically.");
//
//questions.add(" What does the Django `QuerySet` class represent?");
//options.add("A)   A Python class used for defining URL routing in Django., B)    A class for managing HTTP requests and responses., C)   A database query made by Django represented in Python., D)    A class for defining HTML templates.");
//answers.add("A) A database query made by Django, represented in Python.");
//
//questions.add(" In Django, what is the purpose of the "collectstatic" management command?");
//options.add("A)   To collect user data for analytics., B)    To collect database records from multiple sources., C)   To collect all static files (CSS JavaScript images) from each of your applications into a single location., D)    To collect logs for debugging purposes.");
//answers.add("A) To collect all static files (CSS, JavaScript, images) from each of your applications into a single location.");
//
//questions.add(" What is the Django Admin site used for?");
//options.add("A)   To manage user authentication., B)    To define URL routing for Django applications., C)   To provide an automatically generated admin interface for your models., D)    To write and run database queries.");
//answers.add("A) To provide an automatically generated admin interface for your models.");
//
//questions.add(" What does Django's "middleware" refer to?");
//options.add("A)   A way to create user interfaces., B)    A database query in Django., C)   A way to process HTTP requests and responses globally before they reach the view or after they leave the view., D)    A way to configure URL routing in Django.");
//answers.add("A) A way to process HTTP requests and responses globally before they reach the view or after they leave the view.");
//
//questions.add(" What is the primary purpose of Django's "migration files"?");
//options.add("A)  To define and store changes to the database schema over time., B)    To manage static files like CSS and JavaScript., C)    To configure URL patterns., D)    To create HTML templates.");
//answers.add("A) To define and store changes to the database schema over time.");
//
//questions.add(" Which authentication system does Django provide out of the box?");
//options.add("A)   OAuth 2.0, B)   User authentication with built-in user models and views., C)    JWT (JSON Web Tokens), D)    SAML (Security Assertion Markup Language)");
//answers.add("A) User authentication with built-in user models and views.");
//
//questions.add(" In Django, what does the "Model-View-Controller" (MVC) architectural pattern refer to?");
//options.add("A)   A pattern for defining URL routing., B)    A pattern for creating HTML templates., C)   A pattern that divides the application into three interconnected components: Model View and Controller (Django often refers to it as MTV Model-View-Template)., D)    A pattern for user authentication.");
//answers.add("A) A pattern that divides the application into three interconnected components: Model, View, and Controller (Django often refers to it as MTV, Model-View-Template).");
//
//questions.add(" What is the purpose of Django's "templates"?");
//options.add("A)   To define database schema and model relationships., B)   To define the structure and layout of HTML pages to be served to the user., C)    To configure URL patterns for your application., D)    To store and serve static files like images and JavaScript.");
//answers.add("A) To define the structure and layout of HTML pages to be served to the user.");

