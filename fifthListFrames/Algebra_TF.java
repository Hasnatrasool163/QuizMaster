package fifthListFrames;

import frame.True_False_Questions;

public class Algebra_TF extends True_False_Questions {

    public Algebra_TF(String name) {
        super(name);
    }

//  48
    @Override
    public final void loadQuestions() {

        questions.add("In algebra, a quadratic equation is a polynomial equation of the second degree.");
        answers.add("True");

        questions.add("The Fundamental Theorem of Algebra states that every polynomial equation has at least one real or complex root.");
        answers.add("True");

        questions.add("A linear equation always has exactly one solution.");
        answers.add("False");

        questions.add("The domain of a function is the set of all possible input values.");
        answers.add("True");

        questions.add("A function can have more than one output for the same input.");
        answers.add("False");

        questions.add("In algebra, 'x' is often used as a placeholder for an unknown variable.");
        answers.add("True");

        questions.add("Factoring is the process of finding the factors of a polynomial.");
        answers.add("True");

        questions.add("The graph of a quadratic function is always a straight line.");
        answers.add("False");

        questions.add("The slope of a vertical line is undefined.");
        answers.add("True");

        questions.add("The Pythagorean theorem relates the sides of a right triangle: a^2 + b^2 = c^2.");
        answers.add("True");

        questions.add("An irrational number can be expressed as a ratio of two integers.");
        answers.add("False");

        questions.add("In calculus, differentiation is the process of finding the derivative of a function.");
        answers.add("True");

        questions.add("The derivative of a constant function is always zero.");
        answers.add("True");

        questions.add("The chain rule is used to differentiate composite functions.");
        answers.add("True");

        questions.add("Integration is the process of finding the derivative of a function.");
        answers.add("False");

        questions.add("The definite integral of a function represents the area under its curve between two specified limits.");
        answers.add("True");

        questions.add("The Mean Value Theorem states that if a function is continuous on a closed interval and differentiable on the open interval, there exists at least one point where the derivative of the function is equal to the average rate of change over the interval.");
        answers.add("True");

        questions.add("The power rule is used to differentiate exponential functions.");
        answers.add("True");

        questions.add("Newton's method is used to find the maximum or minimum of a function.");
        answers.add("False");

        questions.add("In calculus, a critical point of a function is a point where the derivative is either zero or undefined.");
        answers.add("True");

        questions.add("The natural logarithm function, ln(x), is the inverse of the exponential function, e^x.");
        answers.add("True");

        questions.add("In algebra, a complex number is a number that can be expressed in the form a + bi, where 'a' and 'b' are real numbers, and 'i' is the imaginary unit.");
        answers.add("True");

        questions.add("The quadratic formula can be used to find the solutions to any quadratic equation.");
        answers.add("True");

        questions.add("The discriminant of a quadratic equation can be negative.");
        answers.add("True");

        questions.add("In calculus, the product rule is used to differentiate the product of two functions.");
        answers.add("True");

        questions.add("The integral of a constant function over a non-zero interval is always zero.");
        answers.add("False");

        questions.add("A horizontal asymptote is a line that the graph of a function approaches as x approaches infinity or negative infinity.");
        answers.add("True");

        questions.add("In calculus, the second derivative of a function is the derivative of its derivative.");
        answers.add("True");

        questions.add("In algebra, a rational function is a function that can be expressed as the quotient of two polynomials.");
        answers.add("True");

        questions.add("The derivative of a constant function is undefined.");
        answers.add("False");

        questions.add("The absolute value function, |x|, is always non-negative.");
        answers.add("True");

        questions.add("A linear function is always represented by a polynomial of degree one.");
        answers.add("True");

        questions.add("In calculus, L'Hopital's rule is used to evaluate limits involving indeterminate forms.");
        answers.add("True");

        questions.add("In algebra, a polynomial of degree n has exactly n roots, real or complex.");
        answers.add("True");

        questions.add("The domain of the function f(x) = 1 / (x - 1) includes all real numbers except x = 1.");
        answers.add("True");

        questions.add("A vertical asymptote occurs where a function approaches infinity or negative infinity.");
        answers.add("True");

        questions.add("The derivative of a function gives the rate of change of the function with respect to its input variable.");
        answers.add("True");

        questions.add("In calculus, integration can be thought of as the reverse process of differentiation.");
        answers.add("True");

        questions.add("The inflection point of a function is a point where the function changes concavity.");
        answers.add("True");

        questions.add("In algebra, the term 'binomial' refers to a polynomial with exactly two terms.");
        answers.add("True");

        questions.add("The domain of the function f(x) = sqrt(x) includes all real numbers.");
        answers.add("True");

        questions.add("The product rule is used to find the derivative of a product of two functions.");
        answers.add("True");

        questions.add("In calculus, the chain rule is used to find the derivative of composite functions.");
        answers.add("True");

        questions.add("In algebra, the distributive property states that a(b + c) = ab + ac.");
        answers.add("True");

        questions.add("The average rate of change of a function f(x) over the interval [a, b] is given by (f(b) - f(a)) / (b - a).");
        answers.add("True");

        questions.add("The derivative of an exponential function, such as e^x, is the function itself.");
        answers.add("True");

        questions.add("A linear equation always has exactly two solutions.");
        answers.add("False");

        questions.add("The square root function, sqrt(x), is defined only for non-negative real numbers.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Algebra_TF(name).setVisible(true);
    }

}
