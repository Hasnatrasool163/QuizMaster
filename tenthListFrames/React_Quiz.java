package tenthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class React_Quiz extends Quiz {

    public React_Quiz(String name) {
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

    // 43
    @Override
    public final void loadQuestions() {

        questions.add("What is the purpose of state in React?");
        options.add("A) To store component's private data, B) To manage component's lifecycle, C) To handle component's props, D) To define component's structure");
        answers.add("A) To store component's private data");

        questions.add("What are props in React?");
        options.add("A) Immutable data, B) Mutable data, C) Component's private data, D) Local state data");
        answers.add("A) Immutable data");

        questions.add("What is a functional component in React?");
        options.add("A) Component with state management, B) Component with complex logic, C) Component without lifecycle methods, D) Component without props");
        answers.add("C) Component without lifecycle methods");

        questions.add("What is a class component in React?");
        options.add("A) Component with props only, B) Component with functional methods, C) Component without lifecycle methods, D) Component with state and lifecycle methods");
        answers.add("D) Component with state and lifecycle methods");

        questions.add("What is the purpose of render() method in React?");
        options.add("A) To update component's state, B) To define component's props, C) To output component's UI, D) To handle component's lifecycle");
        answers.add("C) To output component's UI");

        questions.add("What are lifecycle methods in React?");
        options.add("A) Methods to handle component's state, B) Methods to manage component's props, C) Methods to define component's structure, D) Methods to perform actions at specific points");
        answers.add("D) Methods to perform actions at specific points");

        questions.add("What is the componentDidMount() lifecycle method in React?");
        options.add("A) Invoked before rendering, B) Invoked after rendering, C) Invoked during state updates, D) Invoked during component unmounting");
        answers.add("B) Invoked after rendering");

        questions.add("How do you update the state in React?");
        options.add("A) Using this.state() method, B) Using this.updateState() method, C) Using this.setState() method, D) Using this.modifyState() method");
        answers.add("C) Using this.setState() method");

        questions.add("What is JSX in React?");
        options.add("A) A new JavaScript extension, B) A templating engine for React, C) A syntax for embedding XML within JavaScript, D) A syntax for embedding JavaScript within XML");
        answers.add("C) A syntax for embedding XML within JavaScript");

        questions.add("What are keys in React lists used for?");
        options.add("A) To uniquely identify elements, B) To add styling to elements, C) To perform asynchronous updates, D) To control component's lifecycle");
        answers.add("A) To uniquely identify elements");

        questions.add("What is the purpose of refs in React?");
        options.add("A) To manage component's props, B) To handle component's state, C) To reference DOM nodes or React elements, D) To define component's lifecycle");
        answers.add("C) To reference DOM nodes or React elements");

        questions.add("What are React hooks?");
        options.add("A) Functions to create new components, B) Functions to handle lifecycle events, C) Functions to work with props, D) Functions to use state and other React features");
        answers.add("D) Functions to use state and other React features");

        questions.add("What is the useState hook in React?");
        options.add("A) Function to handle props, B) Function to create new components, C) Function to manage state, D) Function to work with lifecycle events");
        answers.add("C) Function to manage state");

        questions.add("What is the useEffect hook in React?");
        options.add("A) Function to handle state updates, B) Function to handle props, C) Function to perform side effects, D) Function to create new components");
        answers.add("C) Function to perform side effects");

        questions.add("What is the useContext hook in React?");
        options.add("A) Function to handle lifecycle events, B) Function to manage state, C) Function to work with props, D) Function to consume context");
        answers.add("D) Function to consume context");

        questions.add("What is the useCallback hook in React?");
        options.add("A) Function to optimize performance, B) Function to create new components, C) Function to handle props, D) Function to handle state updates");
        answers.add("A) Function to optimize performance");

        questions.add("What is the useMemo hook in React?");
        options.add("A) Function to optimize performance, B) Function to handle state updates, C) Function to work with props, D) Function to handle lifecycle events");
        answers.add("A) Function to optimize performance");

        questions.add("What is the main function of the React Router library?");
        options.add("A) To manage the state of React components, B) To handle asynchronous data fetching, C) To provide routing functionality for React applications, D) To manage global state in React");
        answers.add("C) To provide routing functionality for React applications");

        questions.add("What is the purpose of the useHistory hook in React Router?");
        options.add("A) To manage session storage, B) To handle browser history navigation, C) To manage component lifecycle, D) To perform server-side rendering");
        answers.add("B) To handle browser history navigation");

        questions.add("What is the NavLink component used for in React Router?");
        options.add("A) To display a link to another React component, B) To add custom styling to a link, C) To navigate to a different route while keeping the UI state, D) To manage dynamic routes in React");
        answers.add("C) To navigate to a different route while keeping the UI state");

        questions.add("What is the difference between React.Component and React.PureComponent?");
        options.add("A) React.Component supports props, while React.PureComponent does not, B) React.PureComponent implements shouldComponentUpdate() with a shallow prop and state comparison, C) React.PureComponent renders only once, while React.Component renders on every state change, D) React.Component is used for functional components, while React.PureComponent is used for class components");
        answers.add("B) React.PureComponent implements shouldComponentUpdate() with a shallow prop and state comparison");

        questions.add("How do you handle forms in React?");
        options.add("A) By using native HTML form elements, B) By using React form component, C) By using Redux, D) By using state and event handlers");
        answers.add("D) By using state and event handlers");

        questions.add("What is conditional rendering in React?");
        options.add("A) Rendering based on browser capabilities, B) Rendering based on user roles, C) Rendering based on component's state or props, D) Rendering based on server response");
        answers.add("C) Rendering based on component's state or props");

        questions.add("What is error boundary in React?");
        options.add("A) A component to handle errors in child components during rendering, B) A component to handle HTTP errors, C) A component to handle routing errors, D) A component to handle state errors");
        answers.add("A) A component to handle errors in child components during rendering");

        questions.add("What is the purpose of React.Fragment in React?");
        options.add("A) To create reusable components, B) To provide a higher-order component, C) To group multiple elements without adding extra nodes to the DOM, D) To define global state");
        answers.add("C) To group multiple elements without adding extra nodes to the DOM");

        questions.add("What is the context API in React?");
        options.add("A) API for asynchronous data fetching, B) API for managing application state, C) API for component lifecycle methods, D) API for styling components");
        answers.add("B) API for managing application state");

        questions.add("What are higher-order components (HOC) in React?");
        options.add("A) Components with a high degree of complexity, B) Components that render only once, C) Components that accept props and return new components, D) Components that manage global state");
        answers.add("C) Components that accept props and return new components");

        questions.add("How do you pass data between components in React?");
        options.add("A) Using state only, B) Using props only, C) Using Redux, D) Using state and props");
        answers.add("D) Using state and props");

        questions.add("What is server-side rendering in React?");
        options.add("A) Rendering React components on the server side, B) Rendering components with server data, C) Rendering React components using node.js, D) Rendering components with server-side authentication");
        answers.add("A) Rendering React components on the server side");

        questions.add("What is the purpose of keys in React lists?");
        options.add("A) To uniquely identify elements, B) To style list items, C) To handle asynchronous updates, D) To control component's lifecycle");
        answers.add("A) To uniquely identify elements");

        questions.add("What is the difference between controlled and uncontrolled components in React?");
        options.add("A) Controlled components use refs while uncontrolled components use state, B) Controlled components manage their own state while uncontrolled components rely on parent components, C) Controlled components have inputs controlled by React state while uncontrolled components have inputs controlled by DOM, D) Controlled components use class components, while uncontrolled components use functional components");
        answers.add("C) Controlled components have inputs controlled by React state while uncontrolled components have inputs controlled by DOM");

        questions.add("What is Redux?");
        options.add("A) A state management library for React, B) A server-side rendering library, C) A component styling library, D) A form handling library");
        answers.add("A) A state management library for React");

        questions.add("What is the purpose of mapStateToProps() in Redux?");
        options.add("A) To map dispatch functions to props, B) To connect React components to Redux store, C) To map state from the Redux store to component props, D) To define component's initial state");
        answers.add("C) To map state from the Redux store to component props");

        questions.add("What is Redux Thunk?");
        options.add("A) A middleware for handling asynchronous actions in Redux, B) A utility for managing Redux store, C) A function for optimizing Redux performance, D) A tool for integrating Redux with React components");
        answers.add("A) A middleware for handling asynchronous actions in Redux");

        questions.add("What is the purpose of combineReducers() in Redux?");
        options.add("A) To combine multiple reducers into a single reducer function, B) To combine multiple actions into a single action, C) To combine multiple components into a single component, D) To combine multiple stores into a single store");
        answers.add("A) To combine multiple reducers into a single reducer function");

        questions.add("What is the role of mapDispatchToProps() in Redux?");
        options.add("A) To manage component props, B) To connect React components to Redux store, C) To dispatch actions to Redux store, D) To define component's initial state");
        answers.add("C) To dispatch actions to Redux store");

        questions.add("How do you connect a React component to Redux?");
        options.add("A) By using connect() function from react-redux library, B) By using setState() method, C) By using fetch() method, D) By using props() method");
        answers.add("A) By using connect() function from react-redux library");

        questions.add("What is the role of Provider component in Redux?");
        options.add("A) To manage global state, B) To wrap the application and provide Redux store to components, C) To handle server-side rendering, D) To style components");
        answers.add("B) To wrap the application and provide Redux store to components");

        questions.add("What is the difference between Redux and React Context API?");
        options.add("A) Redux is a state management library, while Context API is for handling application context, B) Redux is used for handling routing, while Context API is for managing state, C) Redux is for functional components, while Context API is for class components, D) Redux is for server-side rendering, while Context API is for client-side rendering");
        answers.add("A) Redux is a state management library, while Context API is for handling application context");

        questions.add("What is React.memo() used for?");
        options.add("A) To memoize functional components in React, B) To handle asynchronous operations in React components, C) To manage Redux store, D) To optimize React performance");
        answers.add("A) To memoize functional components in React");

        questions.add("What is the purpose of useCallback() hook in React?");
        options.add("A) To optimize performance by memoizing callback functions, B) To manage component props, C) To create reusable components, D) To handle component's state");
        answers.add("A) To optimize performance by memoizing callback functions");

        questions.add("What is the purpose of useMemo() hook in React?");
        options.add("A) To manage component's lifecycle, B) To optimize performance by memoizing values, C) To handle routing in React applications, D) To create Redux actions");
        answers.add("B) To optimize performance by memoizing values");

        questions.add("What is the role of withRouter() HOC in React Router?");
        options.add("A) To create higher-order components, B) To connect components to Redux store, C) To manage React component's state, D) To provide access to the history object's properties");
        answers.add("D) To provide access to the history object's properties");

    }


    public static void main(String[] args) {
        new React_Quiz(name).setVisible(true);
    }

}
