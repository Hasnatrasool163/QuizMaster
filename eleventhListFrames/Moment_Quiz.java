package eleventhListFrames;

import frame.Quiz;


/**
 * @author MuhammadHasnatRasool
 */
public class Moment_Quiz extends Quiz{
    

    public Moment_Quiz(String name) {
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


    // questions: 23
    @Override
    public final void loadQuestions() {

        questions.add("What is the main purpose of Moment.js?");
        options.add("A) To parse and format dates, B) To perform mathematical calculations, C) To handle strings, D) To work with arrays");
        answers.add("A) To parse and format dates");

        questions.add("How do you create a moment object?");
        options.add("A) moment(), B) new Moment(), C) Moment.create(), D) moment.create()");
        answers.add("A) moment()");

        questions.add("What is the format for parsing dates in Moment.js?");
        options.add("A) YYYY-MM-DD, B) DD-MM-YYYY, C) MM-DD-YYYY, D) YYYY-DD-MM");
        answers.add("A) YYYY-MM-DD");

        questions.add("How do you format a moment object as a string?");
        options.add("A) format(), B) toString(), C) toFormat(), D) formatString()");
        answers.add("A) format()");

        questions.add("What is the default format for formatting dates in Moment.js?");
        options.add("A) YYYY-MM-DD, B) DD-MM-YYYY, C) MM-DD-YYYY, D) YYYY-DD-MM");
        answers.add("A) YYYY-MM-DD");

        questions.add("How do you add a specified number of days to a moment object?");
        options.add("A) add(), B) plus(), C) subtract(), D) days()");
        answers.add("A) add()");

        questions.add("How do you subtract a specified number of days from a moment object?");
        options.add("A) subtract(), B) minus(), C) add(), D) days()");
        answers.add("A) subtract()");

        questions.add("What is the purpose of the moment().isValid() method?");
        options.add("A) To check if a date is valid, B) To check if a date is invalid, C) To parse a date, D) To format a date");
        answers.add("A) To check if a date is valid");

        questions.add("How do you get the current date and time using Moment.js?");
        options.add("A) moment(), B) moment.now(), C) new Moment(), D) moment.current()");
        answers.add("A) moment()");

        questions.add("What is the purpose of the moment().unix() method?");
        options.add("A) To get the Unix timestamp, B) To get the date in YYYY-MM-DD format, C) To get the date in DD-MM-YYYY format, D) To get the date in MM-DD-YYYY format");
        answers.add("A) To get the Unix timestamp");
        
        questions.add("How do you get the date and time in a specific format using Moment.js?");
        options.add("A) format(), B) toString(), C) toFormat(), D) moment().format()");
        answers.add("A) format()");

        questions.add("What is the purpose of the moment().utc() method?");
        options.add("A) To get the date and time in UTC, B) To get the date and time in the local timezone, C) To parse a date, D) To format a date");
        answers.add("A) To get the date and time in UTC");

        questions.add("How do you compare two moment objects?");
        options.add("A) isEqual(), B) isBefore(), C) isAfter(), D) compare()");
        answers.add("A) isEqual()");

        questions.add("What is the purpose of the moment().diff() method?");
        options.add("A) To get the difference between two dates, B) To get the sum of two dates, C) To parse a date, D) To format a date");
        answers.add("A) To get the difference between two dates");

        questions.add("How do you get the date and time in a specific timezone using Moment.js?");
        options.add("A) moment().tz(), B) moment().timezone(), C) moment().zone(), D) moment().timeZone()");
        answers.add("A) moment().tz()");

        questions.add("What is the purpose of the moment().startOf() method?");
        options.add("A) To get the start of a day, B) To get the start of a week, C) To get the start of a month, D) To get the start of a year");
        answers.add("A) To get the start of a day");

        questions.add("How do you get the end of a day using Moment.js?");
        options.add("A) endOf(), B) startOf(), C) moment().end(), D) moment().start()");
        answers.add("A) endOf()");

        questions.add("What is the purpose of the moment().locale() method?");
        options.add("A) To set the locale, B) To get the locale, C) To parse a date, D) To format a date");
        answers.add("A) To set the locale");

        questions.add("How do you parse a date string using Moment.js?");
        options.add("A) moment(), B) moment.parse(), C) moment.fromString(), D) moment.fromString()");
        answers.add("A) moment()");

        questions.add("What is the purpose of the moment().fromNow() method?");
        options.add("A) To get the time from now, B) To get the time to now, C) To parse a date, D) To format a date");
        answers.add("A) To get the time from now");

        questions.add("How do you add a specified number of months to a moment object?");
        options.add("A) add(), B) plus(), C) subtract(), D) months()");
        answers.add("A) add()");

        questions.add("How do you get the day of the week using Moment.js?");
        options.add("A) day(), B) weekday(), C) dayOfWeek(), D) getDay()");
        answers.add("A) day()");

        questions.add("What is the purpose of the moment().isoWeekday() method?");
        options.add("A) To get the day of the week in ISO format, B) To get the day of the week in US format, C) To parse a date, D) To format a date");
        answers.add("A) To get the day of the week in ISO format");


    }
    

    
    public static void main(String[]args){
        new Moment_Quiz(name).setVisible(true);
    }
    
}


