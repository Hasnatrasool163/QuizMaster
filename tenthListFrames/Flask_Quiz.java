package tenthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Flask_Quiz extends Quiz {

    public Flask_Quiz(String name) {
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

    // 36
    @Override
    public final void loadQuestions() {

        questions.add("What is Flask?");
        options.add("A) A micro web framework for Python, B) A machine learning library, C) A database management system, D) A JavaScript framework");
        answers.add("A) A micro web framework for Python");

        questions.add("Which of the following is true about Flask?");
        options.add("A) It is not suitable for small applications, B) It is built on Django, C) It is easy to get started with, D) It requires a lot of configuration");
        answers.add("C) It is easy to get started with");

        questions.add("How do you import Flask in a Python script?");
        options.add("A) import flask, B) from flask import Flask, C) use Flask;, D) require Flask");
        answers.add("B) from flask import Flask");

        questions.add("What is the command to install Flask using pip?");
        options.add("A) pip install Flask, B) pip install flask, C) pip install python-flask, D) pip flask install");
        answers.add("B) pip install flask");

        questions.add("Which folder is used to store Flask templates by convention?");
        options.add("A) static/, B) templates/, C) pages/, D) views/");
        answers.add("B) templates/");

        questions.add("What is the purpose of Flask's `url_for` function?");
        options.add("A) To define a URL route, B) To create a URL for a given view function, C) To validate URL parameters, D) To delete a URL route");
        answers.add("B) To create a URL for a given view function");

        questions.add("Which HTTP method is used for submitting a form in HTML?");
        options.add("A) GET, B) POST, C) PUT, D) DELETE");
        answers.add("B) POST");

        questions.add("How do you define a route in Flask?");
        options.add("A) @route('/path'), B) route('/path'), C) route('/path') function, D) define_route('/path')");
        answers.add("A) @route('/path')");

        questions.add("Which decorator is used to define a route that accepts both GET and POST requests in Flask?");
        options.add("A) @route('/path', methods=['GET', 'POST']), B) @get_post('/path'), C) @method('GET', 'POST'), D) @get_post");
        answers.add("A) @route('/path', methods=['GET', 'POST'])");

        questions.add("How do you access URL parameters in Flask?");
        options.add("A) request.params, B) request.get_params(), C) request.args, D) route.params");
        answers.add("C) request.args");

        questions.add("What does `redirect()` do in Flask?");
        options.add("A) Stops the current request and returns a response, B) Redirects the client to another URL, C) Reloads the current URL, D) Renders a template");
        answers.add("B) Redirects the client to another URL");

        questions.add("Which template engine is the default in Flask?");
        options.add("A) Django Templates, B) Jinja2, C) Mako, D) Flask Templates");
        answers.add("B) Jinja2");

        questions.add("How do you render a template in Flask?");
        options.add("A) return render('template.html'), B) return render_template('template.html'), C) render_template('template.html'), D) render('template.html')");
        answers.add("C) render_template('template.html')");

        questions.add("Which directory contains static files in Flask by convention?");
        options.add("A) static/, B) public/, C) assets/, D) resources/");
        answers.add("A) static/");

        questions.add("What is the default port on which Flask runs?");
        options.add("A) 5000, B) 8000, C) 8080, D) 3000");
        answers.add("A) 5000");

        questions.add("How do you start the Flask development server?");
        options.add("A) python run.py, B) flask start, C) flask run, D) python app.py");
        answers.add("C) flask run");

        questions.add("What does `abort(404)` do in Flask?");
        options.add("A) Stops the current request and returns a 404 error, B) Redirects to the homepage, C) Renders a template, D) Reloads the current URL");
        answers.add("A) Stops the current request and returns a 404 error");

        questions.add("Which command is used to enable debug mode in Flask?");
        options.add("A) flask debug, B) app.debug = True, C) flask run --debug, D) flask --debug");
        answers.add("C) flask run --debug");

        questions.add("What does `session` object do in Flask?");
        options.add("A) Manages database connections, B) Stores user session data across requests, C) Represents a Flask application, D) Manages static files");
        answers.add("B) Stores user session data across requests");

        questions.add("How do you access a session variable named 'username' in Flask?");
        options.add("A) session.get('username'), B) session.username, C) session['username'], D) get_session('username')");
        answers.add("C) session['username']");

        questions.add("Which of the following is true about Flask blueprints?");
        options.add("A) They are used to create HTML blueprints, B) They are used to define application routes, C) They are used to organize Flask applications into modules, D) They are used to manage database schemas");
        answers.add("C) They are used to organize Flask applications into modules");

        questions.add("How do you register a blueprint named 'auth' in a Flask application?");
        options.add("A) app.register_blueprint('auth'), B) app.register('auth'), C) app.blueprint('auth'), D) app.register_blueprint(auth)");
        answers.add("A) app.register_blueprint('auth')");

        questions.add("What is a decorator in Flask?");
        options.add("A) A function that modifies the behavior of another function, B) A function that returns HTML, C) A function that defines routes, D) A function that handles errors");
        answers.add("A) A function that modifies the behavior of another function");

        questions.add("What is WTForms in Flask?");
        options.add("A) A template engine, B) A database ORM, C) A form validation library, D) A session management tool");
        answers.add("C) A form validation library");

        questions.add("Which command is used to install WTForms in a Flask application?");
        options.add("A) pip install wtforms, B) pip install forms, C) pip install flask-wtforms, D) pip wtforms install");
        answers.add("C) pip install flask-wtforms");

        questions.add("How do you create a WTForms form class in Flask?");
        options.add("A) class MyForm(FlaskForm), B) class MyForm(Form), C) class MyForm(wt.Form), D) class MyForm");
        answers.add("A) class MyForm(FlaskForm)");

        questions.add("Which Flask extension is used for database ORM?");
        options.add("A) Flask-DB, B) SQLAlchemy, C) Flask-SQL, D) Flask-ORM");
        answers.add("B) SQLAlchemy");

        questions.add("How do you initialize SQLAlchemy in a Flask application?");
        options.add("A) db = SQLAlchemy(app), B) db.init(app), C) app.init_db(SQLAlchemy), D) db.connect(app)");
        answers.add("A) db = SQLAlchemy(app)");

        questions.add("Which command is used to install SQLAlchemy in a Flask application?");
        options.add("A) pip install sqlalchemy, B) pip install flask-sqlalchemy, C) pip sqlalchemy install, D) pip install flask-sql");
        answers.add("A) pip install sqlalchemy");

        questions.add("What does `db.session.add()` do in SQLAlchemy?");
        options.add("A) Deletes a database record, B) Updates a database record, C) Adds a new record to the session, D) Queries a database record");
        answers.add("C) Adds a new record to the session");

        questions.add("Which command is used to create a migration script for database changes in Flask?");
        options.add("A) flask db create, B) flask db migrate, C) flask migrate, D) flask db init");
        answers.add("B) flask db migrate");

        questions.add("Which of the following is true about Flask-SQLAlchemy?");
        options.add("A) It is a separate library from SQLAlchemy, B) It is not used for database operations, C) It provides Flask integration for SQLAlchemy, D) It replaces SQLAlchemy");
        answers.add("C) It provides Flask integration for SQLAlchemy");

        questions.add("What is the purpose of Flask-Migrate in a Flask-SQLAlchemy application?");
        options.add("A) To create static files, B) To handle database migrations, C) To manage Flask templates, D) To handle session management");
        answers.add("B) To handle database migrations");

        questions.add("Which command is used to apply database migrations in a Flask application?");
        options.add("A) flask db upgrade, B) flask db apply, C) flask migrate apply, D) flask migrate upgrade");
        answers.add("A) flask db upgrade");

        questions.add("What does `render_template()` do in Flask?");
        options.add("A) Stops the current request and returns a response, B) Renders a Jinja2 template, C) Deletes a URL route, D) Redirects to another URL");
        answers.add("B) Renders a Jinja2 template");

        questions.add("How do you access form data submitted by a POST request in Flask?");
        options.add("A) request.get_form_data(), B) request.form, C) request.data, D) form.get_data()");
        answers.add("B) request.form");

    }

    public static void main(String[] args) {
        new Flask_Quiz(name).setVisible(true);
    }

}
