package fifthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Theorems_Quiz extends Quiz{
    

    public Theorems_Quiz(String name) {
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

// 31 mcqs
    @Override
    public final void loadQuestions() {

        questions.add("What is the statement of the Pythagorean Theorem?");
        options.add("A) a^2 + b^2 = c^2, B) a^2 - b^2 = c^2, C) a^2 * b^2 = c^2, D) a^2 / b^2 = c^2");
        answers.add("A) a^2 + b^2 = c^2");

        questions.add("What is the statement of the Fundamental Theorem of Algebra?");
        options.add("A) Every polynomial equation has a real root, B) Every polynomial equation has a complex root, C) Every polynomial equation has a rational root, D) Every polynomial equation has no roots");
        answers.add("B) Every polynomial equation has a complex root");

        questions.add("What is the statement of the Central Limit Theorem?");
        options.add("A) The sum of independent random variables converges to a normal distribution, B) The product of independent random variables converges to a normal distribution, C) The mean of independent random variables converges to a normal distribution, D) The variance of independent random variables converges to a normal distribution");
        answers.add("A) The sum of independent random variables converges to a normal distribution");

        questions.add("What is the statement of the Binomial Theorem?");
        options.add("A) (a+b)^n = a^n + b^n, B) (a+b)^n = a^n - b^n, C) (a+b)^n = a^n + na^(n-1)b + ... + b^n, D) (a+b)^n = a^n - na^(n-1)b + ... - b^n");
        answers.add("C) (a+b)^n = a^n + na^(n-1)b + ... + b^n");

        questions.add("What is the statement of the Mean Value Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function has a point of inflection on an open interval");
        answers.add("C) A function has a maximum or minimum on a closed interval");

        questions.add("What is the statement of the Intermediate Value Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function takes on all values between its minimum and maximum on a closed interval");
        answers.add("D) A function takes on all values between its minimum and maximum on a closed interval");

        questions.add("What is the statement of the Rolle's Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function has a point of inflection on an open interval");
        answers.add("C) A function has a maximum or minimum on a closed interval");

        questions.add("What is the statement of the Taylor's Theorem?");
        options.add("A) A function can be approximated by a polynomial, B) A function can be approximated by a rational function, C) A function can be approximated by a trigonometric function, D) A function can be approximated by an exponential function");
        answers.add("A) A function can be approximated by a polynomial");

        questions.add("What is the statement of the Fourier Transform Theorem?");
        options.add("A) A function can be represented as a sum of sine and cosine functions, B) A function can be represented as a product of sine and cosine functions, C) A function can be represented as a sum of exponential functions, D) A function can be represented as a product of exponential functions");
        answers.add("A) A function can be represented as a sum of sine and cosine functions ");
        
        questions.add("What is the statement of the Green's Theorem?");
        options.add("A) ∫(P dx + Q dy) = ∫∫(∂Q/∂x - ∂P/∂y) dx dy, B) ∫(P dx + Q dy) = ∫∫(∂Q/∂x + ∂P/∂y) dx dy, C) ∫(P dx + Q dy) = ∫∫(∂P/∂x - ∂Q/∂y) dx dy, D) ∫(P dx + Q dy) = ∫∫(∂P/∂x + ∂Q/∂y) dx dy");
        answers.add("A) ∫(P dx + Q dy) = ∫∫(∂Q/∂x - ∂P/∂y) dx dy");

        questions.add("What is the statement of the Stokes' Theorem?");
        options.add("A) ∫∫(∇×F)·dS = ∫(F·dr), B) ∫∫(∇×F)·dS = -∫(F·dr), C) ∫∫(∇·F)·dS = ∫(F·dr), D) ∫∫(∇·F)·dS = -∫(F·dr)");
        answers.add("A) ∫∫(∇×F)·dS = ∫(F·dr)");

        questions.add("What is the statement of the Divergence Theorem?");
        options.add("A) ∫∫(∇·F)·dS = ∫(F·dr), B) ∫∫(∇·F)·dS = -∫(F·dr), C) ∫∫(∇×F)·dS = ∫(F·dr), D) ∫∫(∇×F)·dS = -∫(F·dr)");
        answers.add("A) ∫∫(∇·F)·dS = ∫(F·dr)");

        questions.add("What is the statement of the Fundamental Theorem of Calculus?");
        options.add("A) ∫(f(x) dx) = F(x) + C, B) ∫(f(x) dx) = F(x) - C, C) ∫(f(x) dx) = F'(x) + C, D) ∫(f(x) dx) = F'(x) - C");
        answers.add("A) ∫(f(x) dx) = F(x) + C");
        
        questions.add("What is the statement of the Fundamental Theorem of Algebra?");
        options.add("A) Every polynomial equation has a real root, B) Every polynomial equation has a complex root, C) Every polynomial equation has a rational root, D) Every polynomial equation has no roots");
        answers.add("B) Every polynomial equation has a complex root");

        questions.add("What is the statement of the Mean Value Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function has a point of inflection on an open interval");
        answers.add("C) A function has a maximum or minimum on a closed interval");

        questions.add("What is the statement of the Intermediate Value Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function takes on all values between its minimum and maximum on a closed interval");
        answers.add("D) A function takes on all values between its minimum and maximum on a closed interval");

        questions.add("What is the statement of the Rolle's Theorem?");
        options.add("A) A function is continuous on a closed interval, B) A function is differentiable on an open interval, C) A function has a maximum or minimum on a closed interval, D) A function has a point of inflection on an open interval");
        answers.add("C) A function has a maximum or minimum on a closed interval");

        questions.add("What is the statement of the Taylor's Theorem?");
        options.add("A) A function can be approximated by a polynomial, B) A function can be approximated by a rational function, C) A function can be approximated by a trigonometric function, D) A function can be approximated by an exponential function");
        answers.add("A) A function can be approximated by a polynomial");

        questions.add("What is the statement of the Fourier Transform Theorem?");
        options.add("A) A function can be represented as a sum of sine and cosine functions, B) A function can be represented as a product of sine and cosine functions, C) A function can be represented as a sum of exponential functions, D) A function can be represented as a product of exponential functions");
        answers.add("A) A function can be represented as a sum of sine and cosine functions");

        questions.add("What is the statement of the Laurent Series Theorem?");
        options.add("A) A function can be represented as a power series, B) A function can be represented as a Laurent series, C) A function can be represented as a Taylor series, D) A function can be represented as a Fourier series");
        answers.add("B) A function can be represented as a Laurent series");

        questions.add("What is the statement of the Residue Theorem?");
        options.add("A) The residue of a function at a pole is equal to the coefficient of the laurent series, B) The residue of a function at a pole is equal to the coefficient of the Taylor series, C) The residue of a function at a pole is equal to the coefficient of the Fourier series, D) The residue of a function at a pole is equal to zero");
        answers.add("A) The residue of a function at a pole is equal to the coefficient of the laurent series");

        questions.add("What is the statement of the Cauchy's Integral Formula?");
        options.add("A) f(a) = (1/2πi) ∫(f(z) dz)/(z-a), B) f(a) = (1/2πi) ∫(f(z) dz)/(z+a), C) f(a) = (1/2πi) ∫(f(z) dz)/(z-a)^2, D) f(a) = (1/2πi) ∫(f(z) dz)/(z+a)^2");
        answers.add("A) f(a) = (1/2πi) ∫(f(z) dz)/(z-a)");
        
        questions.add("What is the statement of the Bolzano-Weierstrass Theorem?");
        options.add("A) Every bounded sequence has a convergent subsequence, B) Every unbounded sequence has a divergent subsequence, C) Every convergent sequence has a bounded subsequence, D) Every divergent sequence has an unbounded subsequence");
        answers.add("A) Every bounded sequence has a convergent subsequence");

        questions.add("What is the statement of the Heine-Borel Theorem?");
        options.add("A) Every open cover of a compact set has a finite subcover, B) Every closed cover of a compact set has a finite subcover, C) Every open cover of a non-compact set has a finite subcover, D) Every closed cover of a non-compact set has a finite subcover");
        answers.add("A) Every open cover of a compact set has a finite subcover");

        questions.add("What is the statement of the Arzela-Ascoli Theorem?");
        options.add("A) Every equicontinuous sequence of functions has a uniformly convergent subsequence, B) Every equicontinuous sequence of functions has a pointwise convergent subsequence, C) Every uniformly convergent sequence of functions has an equicontinuous subsequence, D) Every pointwise convergent sequence of functions has an equicontinuous subsequence");
        answers.add("A) Every equicontinuous sequence of functions has a uniformly convergent subsequence");

        questions.add("What is the statement of the Lebesgue Dominated Convergence Theorem?");
        options.add("A) If a sequence of functions is dominated by an integrable function, then the limit of the sequence is integrable, B) If a sequence of functions is dominated by a non-integrable function, then the limit of the sequence is non-integrable, C) If a sequence of functions is dominated by an integrable function, then the limit of the sequence is non-integrable, D) If a sequence of functions is dominated by a non-integrable function, then the limit of the sequence is integrable");
        answers.add("A) If a sequence of functions is dominated by an integrable function, then the limit of the sequence is integrable");

        questions.add("What is the statement of the Fubini's Theorem?");
        options.add("A) The order of integration can be reversed for a double integral, B) The order of integration cannot be reversed for a double integral, C) The order of integration can be reversed for a triple integral, D) The order of integration cannot be reversed for a triple integral");
        answers.add("A) The order of integration can be reversed for a double integral");

        questions.add("What is the statement of the Tonelli's Theorem?");
        options.add("A) A double integral can be evaluated as an iterated integral, B) A double integral cannot be evaluated as an iterated integral, C) A triple integral can be evaluated as an iterated integral, D) A triple integral cannot be evaluated as an iterated integral");
        answers.add("A) A double integral can be evaluated as an iterated integral");

        questions.add("What is the statement of the Jordan Curve Theorem?");
        options.add("A) A simple closed curve in the plane divides the plane into two connected regions, B) A simple closed curve in the plane does not divide the plane into two connected regions, C) A simple open curve in the plane divides the plane into two connected regions, D) A simple open curve in the plane does not divide the plane into two connected regions");
        answers.add("A) A simple closed curve in the plane divides the plane into two connected regions");

        questions.add("What is the statement of the Brouwer Fixed Point Theorem?");
        options.add("A) Every continuous function from a closed ball in Euclidean space to itself has a fixed point, B) Every continuous function from a closed ball in Euclidean space to itself does not have a fixed point, C) Every continuous function from an open ball in Euclidean space to itself has a fixed point, D) Every continuous function from an open ball in Euclidean space to itself does not have a fixed point");
        answers.add("A) Every continuous function from a closed ball in Euclidean space to itself has a fixed point");

        questions.add("What is the statement of the Schauder Fixed Point Theorem?");
        options.add("A) Every compact convex subset of a Banach space has a fixed point, B) Every compact convex subset of a Banach space does not have a fixed point, C) Every non-compact convex subset of a Banach space has a fixed point, D) Every non-compact convex subset of a Banach space does not have a fixed point");
        answers.add("A) Every compact convex subset of a Banach space has a fixed point");
    }
    

    
    public static void main(String[]args){
        new Theorems_Quiz(name).setVisible(true);
    }
    
}