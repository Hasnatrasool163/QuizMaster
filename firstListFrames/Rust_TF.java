package firstListFrames;

import frame.True_False_Questions;

public class Rust_TF extends True_False_Questions {

    public Rust_TF(String name) {
        super(name);
    }

// rust tf 78
    @Override
    public final void loadQuestions() {

        questions.add("Rust does not allow null pointers.");
        answers.add("True");

        questions.add("In Rust, function arguments are always passed by reference.");
        answers.add("False");

        questions.add("Rust's ownership system guarantees memory safety and prevents data races at compile time.");
        answers.add("True");

        questions.add("Rust's 'match' keyword is equivalent to 'switch' statements in other programming languages.");
        answers.add("True");

        questions.add("Rust's 'const' keyword can be used to declare compile-time constants with any type.");
        answers.add("False");

        questions.add("In Rust, 'let' bindings are mutable by default.");
        answers.add("False");

        questions.add("Rust's 'Result' type is used for handling recoverable errors.");
        answers.add("True");

        questions.add("Traits in Rust are similar to interfaces in Java or C#.");
        answers.add("True");

        questions.add("Rust's 'unsafe' keyword indicates that the code is guaranteed to be safe to execute.");
        answers.add("False");

        questions.add("In Rust, arrays and slices have fixed sizes determined at runtime.");
        answers.add("False");

        questions.add("Rust's lifetimes ensure that references are always valid for the lifetime of the program.");
        answers.add("False");

        questions.add("Rust's 'cargo' tool is used for package management and building projects.");
        answers.add("True");

        questions.add("Rust's 'if let' syntax allows for pattern matching within conditional expressions.");
        answers.add("True");

        questions.add("Rust's 'Deref' trait is used to overload the dereference operator '*'.");
        answers.add("True");

        questions.add("Rust's 'static' lifetime indicates that a reference can live for the entire duration of the program.");
        answers.add("True");

        questions.add("Rust's 'async' keyword is used to define asynchronous functions that can await futures.");
        answers.add("True");

        questions.add("Rust's 'move' keyword is used to transfer ownership of variables between threads.");
        answers.add("True");

        questions.add("Rust's 'Box<T>' type is used for heap-allocated values with a known size at compile time.");
        answers.add("True");

        questions.add("Rust's 'Option<T>' type represents an optional value and can be either 'Some' or 'None'.");
        answers.add("True");

        questions.add("Rust's 'drop' trait is used to define the behavior when an object goes out of scope.");
        answers.add("True");

        questions.add("Rust's 'unsafe' blocks can bypass borrow checking and other safety guarantees.");
        answers.add("True");

        questions.add("Rust does not support function overloading.");
        answers.add("True");

        questions.add("Rust's 'iter' method allows iteration over mutable references of collection elements.");
        answers.add("False");

        questions.add("In Rust, 'fn' keyword is used to declare a function.");
        answers.add("True");

        questions.add("Rust's 'if' expressions must always have an 'else' branch.");
        answers.add("False");

        questions.add("Rust's 'unwrap' method on 'Result' panics if the result is 'Err'.");
        answers.add("True");

        questions.add("Rust's 'Rc<T>' type provides shared ownership of a value, allowing multiple references to it.");
        answers.add("True");

        questions.add("Rust's 'String' type is always stored on the stack.");
        answers.add("False");

        questions.add("Rust's 'struct' keyword is used to define structs that are similar to classes in object-oriented languages.");
        answers.add("True");

        questions.add("Rust's 'self' keyword is used to explicitly specify the type of 'self' in method definitions.");
        answers.add("False");

        questions.add("Rust's 'match' expressions must cover all possible cases of a pattern.");
        answers.add("False");

        questions.add("Rust's 'Cow' type allows for cheaply cloning data when necessary.");
        answers.add("True");

        questions.add("Rust's 'Box<dyn Trait>' is used to create trait objects that can hold values of any type implementing the specified trait.");
        answers.add("True");

        questions.add("Rust's 'impl' keyword is used to implement methods for a trait.");
        answers.add("True");

        questions.add("Rust's 'const fn' allows the evaluation of functions at compile-time.");
        answers.add("True");

        questions.add("Rust's 'panic!' macro is used to gracefully handle recoverable errors.");
        answers.add("False");

        questions.add("Rust's 'async fn' declares a function that can await other async functions or futures.");
        answers.add("True");

        questions.add("Rust's 'u32' type is always 32 bits in size across different platforms.");
        answers.add("True");

        questions.add("Rust's 'cargo test' command is used to run tests defined in the project.");
        answers.add("True");

        questions.add("Rust's 'PartialEq' trait allows for comparing values for equality.");
        answers.add("True");

        questions.add("Rust's 'unsafe' code can introduce data races in concurrent programs.");
        answers.add("True");

        questions.add("Rust's 'trait objects' are statically sized and allow for dynamic dispatch.");
        answers.add("False");

        questions.add("Rust's 'use' statement is used to import symbols into the current scope.");
        answers.add("True");

        questions.add("Rust's 'static mut' allows for mutable static variables.");
        answers.add("True");

        questions.add("Rust's 'for' loop can iterate over ranges and collections.");
        answers.add("True");

        questions.add("Rust's 'match' expressions are more efficient than using 'if' and 'else' chains.");
        answers.add("False");

        questions.add("Rust's 'derive' attribute allows for automatic implementation of traits like 'Clone' and 'Debug'.");
        answers.add("True");

        questions.add("Rust's 'cargo build' command compiles the project without optimization.");
        answers.add("False");

        questions.add("Rust's 'enum' can have associated values with different types.");
        answers.add("True");

        questions.add("Rust's 'Result' type is defined as 'enum Result<T, E> { Ok(T), Err(E) }'.");
        answers.add("True");

        questions.add("Rust's 'HashMap' guarantees ordering of its keys by default.");
        answers.add("False");

        questions.add("Rust's 'Arc<T>' provides atomic reference counting for shared ownership across threads.");
        answers.add("True");

        questions.add("Rust's 'assert_eq!' macro is used for writing unit tests.");
        answers.add("True");

        questions.add("Rust's 'copy' trait is automatically derived for types that implement 'Clone'.");
        answers.add("False");

        questions.add("Rust's 'Iterator' trait provides a standard way to produce a sequence of values.");
        answers.add("True");

        questions.add("Rust's 'unsafe' functions can be called from safe Rust code.");
        answers.add("True");

        questions.add("Rust's 'slice' type can be resized dynamically at runtime.");
        answers.add("False");

        questions.add("Rust's 'cargo run' command builds and executes the project.");
        answers.add("True");

        questions.add("Rust's 'unwrap_or' method on 'Option' provides a default value if the option is 'None'.");
        answers.add("True");

        questions.add("Rust's 'Arc<T>' cannot be safely used in single-threaded applications.");
        answers.add("False");

        questions.add("Rust's 'async' functions cannot be called directly from synchronous code.");
        answers.add("True");

        questions.add("Rust's 'unsafe' code blocks must be marked with the 'unsafe' keyword.");
        answers.add("True");

        questions.add("Rust's 'String' type is UTF-8 encoded.");
        answers.add("True");

        questions.add("Rust's 'dyn Trait' syntax is used for trait objects when the trait is unknown at compile time.");
        answers.add("True");

        questions.add("Rust's 'panic!' macro terminates the program immediately.");
        answers.add("True");

        questions.add("Rust's 'use' statement can alias imported items for easier access.");
        answers.add("True");

        questions.add("Rust's 'slice' type is a view into a contiguous sequence of elements.");
        answers.add("True");

        questions.add("Rust's 'mem::forget' function deallocates memory associated with a boxed value.");
        answers.add("False");

        questions.add("Rust's 'drop' method is called when a value goes out of scope.");
        answers.add("True");

        questions.add("Rust's 'impl Trait' syntax is used to return a concrete type that implements a trait.");
        answers.add("True");

        questions.add("Rust's 'Option<T>' type allows for nullable values.");
        answers.add("True");

        questions.add("Rust's 'trait objects' can have methods that are statically dispatched.");
        answers.add("False");

        questions.add("Rust's 'const' items can be mutable.");
        answers.add("False");

        questions.add("Rust's 'async' blocks can be used to define asynchronous functions inline.");
        answers.add("True");

        questions.add("Rust's 'Vec<T>' type is a dynamically sized array.");
        answers.add("True");

        questions.add("Rust's 'Crate' is a unit of compilation and a library or executable.");
        answers.add("True");

        questions.add("Rust's 'extern crate' statement is required to use external crates.");
        answers.add("False");

        questions.add("Rust's 'const' items can be initialized with any expression that can be evaluated at runtime.");
        answers.add("False");

    }

    public static void main(String[] args) {
        new Rust_TF(name).setVisible(true);
    }

}
