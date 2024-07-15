package firstListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Lisp_Quiz extends Quiz {

    public Lisp_Quiz(String name) {
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

    // quiz: 42
    @Override
    public final void loadQuestions() {

        questions.add("What is the basic syntax to print output in Lisp?");
        options.add("A) print(), B) display(), C) write(), D) show()");
        answers.add("A) print()");

        questions.add("Which function is used to create a list in Lisp?");
        options.add("A) list(), B) create_list(), C) make_list(), D) cons()");
        answers.add("A) list()");

        questions.add("How do you define a function in Lisp?");
        options.add("A) define(), B) defun(), C) function(), D) func()");
        answers.add("B) defun()");

        questions.add("What is the function used to concatenate two lists in Lisp?");
        options.add("A) append(), B) concat(), C) join(), D) list_concat()");
        answers.add("A) append()");

        questions.add("Which operator is used for assignment in Lisp?");
        options.add("A) =, B) :=, C) set!, D) <-");
        answers.add("C) set!");

        questions.add("How do you check the length of a list in Lisp?");
        options.add("A) len(), B) length(), C) count(), D) list_length()");
        answers.add("B) length()");

        questions.add("What is the function to access the first element of a list in Lisp?");
        options.add("A) first(), B) car(), C) head(), D) get_first()");
        answers.add("B) car()");

        questions.add("How do you access the second element of a list in Lisp?");
        options.add("A) cdr(), B) second(), C) rest(), D) get_second()");
        answers.add("A) cdr()");

        questions.add("Which function is used to reverse a list in Lisp?");
        options.add("A) reverse(), B) rev(), C) flip(), D) list_reverse()");
        answers.add("A) reverse()");

        questions.add("What is the function used to check if an element is in a list in Lisp?");
        options.add("A) in_list(), B) member(), C) contains(), D) list_contains()");
        answers.add("B) member()");

        questions.add("How do you create a lambda function in Lisp?");
        options.add("A) lambda(), B) create_lambda(), C) func(), D) deflambda()");
        answers.add("A) lambda()");

        questions.add("Which function is used to apply a function to each element of a list in Lisp?");
        options.add("A) map(), B) apply(), C) each(), D) for_each()");
        answers.add("A) map()");

        questions.add("What is the function to sort a list in Lisp?");
        options.add("A) sort(), B) order(), C) arrange(), D) list_sort()");
        answers.add("A) sort()");

        questions.add("How do you find the maximum value in a list in Lisp?");
        options.add("A) max(), B) maximum(), C) find_max(), D) list_max()");
        answers.add("A) max()");

        questions.add("Which function is used to check if a list is empty in Lisp?");
        options.add("A) is_empty(), B) empty(), C) list_empty(), D) null()");
        answers.add("D) null()");

        questions.add("What is the function to concatenate two strings in Lisp?");
        options.add("A) concat(), B) append(), C) str_concat(), D) string_concat()");
        answers.add("B) append()");

        questions.add("How do you find the intersection of two lists in Lisp?");
        options.add("A) intersect(), B) common(), C) intersection(), D) list_intersection()");
        answers.add("C) intersection()");

        questions.add("Which function is used to apply a function to elements of two lists in Lisp?");
        options.add("A) map2(), B) apply2(), C) each2(), D) for_each2()");
        answers.add("A) map2()");

        questions.add("What is the function used to remove duplicates from a list in Lisp?");
        options.add("A) unique(), B) remove_duplicates(), C) distinct(), D) list_unique()");
        answers.add("A) unique()");

        questions.add("How do you check if two lists are equal in Lisp?");
        options.add("A) equal(), B) equals(), C) list_equal(), D) list_equals()");
        answers.add("A) equal()");

        questions.add("Which function is used to find the position of an element in a list in Lisp?");
        options.add("A) position(), B) find(), C) locate(), D) list_position()");
        answers.add("B) find()");

        questions.add("What is the function to append an element to the end of a list in Lisp?");
        options.add("A) append(), B) add(), C) end(), D) last()");
        answers.add("A) append()");

        questions.add("What is the function used to remove an element from the beginning of a list in Lisp?");
        options.add("A) remove_first(), B) delete_first(), C) pop(), D) list_pop()");
        answers.add("C) pop()");

        questions.add("How do you add two numbers in Lisp?");
        options.add("A) add(), B) sum(), C) +(), D) plus()");
        answers.add("C) +()");

        questions.add("Which function is used to multiply two numbers in Lisp?");
        options.add("A) *, B) multiply(), C) times(), D) product()");
        answers.add("A) *");

        questions.add("What is the function to divide two numbers in Lisp?");
        options.add("A) /(), B) divide(), C) div(), D) quotient()");
        answers.add("A) /()");

        questions.add("How do you define a local variable in a function in Lisp?");
        options.add("A) local(), B) let(), C) var(), D) define_local()");
        answers.add("B) let()");

        questions.add("Which function is used to iterate over a list in Lisp?");
        options.add("A) loop(), B) iterate(), C) for_each(), D) each()");
        answers.add("C) for_each()");

        questions.add("What is the function to get the last element of a list in Lisp?");
        options.add("A) get_last(), B) last(), C) end(), D) tail()");
        answers.add("B) last()");

        questions.add("How do you concatenate two strings in Lisp?");
        options.add("A) concat(), B) str_concat(), C) +(), D) concatenate()");
        answers.add("C) +()");

        questions.add("Which function is used to convert a number to a string in Lisp?");
        options.add("A) str(), B) to_string(), C) convert_to_string(), D) number_to_string()");
        answers.add("B) to_string()");

        questions.add("What is the function to convert a string to uppercase in Lisp?");
        options.add("A) to_upper(), B) upper(), C) uppercase(), D) string_upper()");
        answers.add("C) uppercase()");

        questions.add("How do you check if a number is even in Lisp?");
        options.add("A) even?(), B) is_even(), C) even(), D) number_even()");
        answers.add("A) even?()");

        questions.add("Which function is used to find the square root of a number in Lisp?");
        options.add("A) sqrt(), B) square_root(), C) root(), D) sqrt_root()");
        answers.add("A) sqrt()");

        questions.add("What is the function to generate a random number in Lisp?");
        options.add("A) random(), B) rand(), C) generate_random(), D) random_number()");
        answers.add("B) rand()");

        questions.add("How do you get the current time in Lisp?");
        options.add("A) current_time(), B) time_now(), C) get_time(), D) now()");
        answers.add("D) now()");

        questions.add("Which function is used to open a file in Lisp?");
        options.add("A) open(), B) file_open(), C) open_file(), D) fopen()");
        answers.add("A) open()");

        questions.add("What is the function to close a file in Lisp?");
        options.add("A) close_file(), B) file_close(), C) fclose(), D) close()");
        answers.add("C) fclose()");

        questions.add("How do you read a line from a file in Lisp?");
        options.add("A) read_line(), B) readline(), C) get_line(), D) line_read()");
        answers.add("B) readline()");

        questions.add("Which function is used to write to a file in Lisp?");
        options.add("A) write_file(), B) file_write(), C) fwrite(), D) write()");
        answers.add("D) write()");

        questions.add("What is the function to check if a file exists in Lisp?");
        options.add("A) file_exists(), B) exists(), C) is_file_exists(), D) file_present()");
        answers.add("B) exists()");

        questions.add("How do you delete a file in Lisp?");
        options.add("A) delete_file(), B) file_delete(), C) remove_file(), D) delete()");
        answers.add("C) remove_file()");

    }

    public static void main(String[] args) {
        new Lisp_Quiz(name).setVisible(true);
    }

}
