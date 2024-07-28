
package eleventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Redux_Quiz extends Quiz{
    

    public Redux_Quiz(String name) {
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


    // questions : 30
    @Override
    public final void loadQuestions() {

            questions.add("What is Redux used for in JavaScript applications?");
        options.add("A) Routing, B) State management, C) UI design, D) Form validation");
        answers.add("B) State management");

        questions.add("Which of the following is not a core principle of Redux?");
        options.add("A) Single source of truth, B) State is read-only, C) Changes are made with mutations, D) Pure functions");
        answers.add("C) Changes are made with mutations");

        questions.add("How do you create a Redux store?");
        options.add("A) redux.createStore(reducer), B) store = redux.createStore(reducer), C) createStore(reducer), D) store.create(reducer)");
        answers.add("C) createStore(reducer)");

        questions.add("What is the function of a reducer in Redux?");
        options.add("A) Handles async actions, B) Updates the state based on actions, C) Registers middleware, D) Manages side effects");
        answers.add("B) Updates the state based on actions");

        questions.add("Which method is used to dispatch actions in Redux?");
        options.add("A) store.dispatch(action), B) redux.dispatch(action), C) dispatch(action), D) action.dispatch(store)");
        answers.add("A) store.dispatch(action)");

        questions.add("How do you access the current state in a Redux store?");
        options.add("A) store.current(), B) store.getState(), C) redux.getState(), D) getState()");
        answers.add("B) store.getState()");

        questions.add("What does the connect function do in React Redux?");
        options.add("A) Connects React components to Redux store, B) Connects Redux store to React components, C) Connects components in Redux, D) Connects Redux actions to components");
        answers.add("A) Connects React components to Redux store");

        questions.add("Which middleware is commonly used for async actions in Redux?");
        options.add("A) redux-promise, B) redux-thunk, C) redux-async, D) redux-middleware");
        answers.add("B) redux-thunk");

        questions.add("What is the purpose of action creators in Redux?");
        options.add("A) Create reducers, B) Create middleware, C) Create actions, D) Create store");
        answers.add("C) Create actions");

        questions.add("How do you define an action in Redux?");
        options.add("A) { type: 'ACTION_TYPE' }, B) action('ACTION_TYPE'), C) createAction('ACTION_TYPE'), D) redux.action('ACTION_TYPE')");
        answers.add("A) { type: 'ACTION_TYPE' }");

        questions.add("What is the typical structure of an action in Redux?");
        options.add("A) { payload: data }, B) { type: 'ACTION_TYPE' payload: data }, C) [type: 'ACTION_TYPE' payload: data], D) [type: 'ACTION_TYPE']");
        answers.add("B) { type: 'ACTION_TYPE' payload: data }");

        questions.add("How do you handle side effects in Redux?");
        options.add("A) Use reducers, B) Use actions, C) Use middleware, D) Use selectors");
        answers.add("C) Use middleware");

        questions.add("Which function is used to combine multiple reducers in Redux?");
        options.add("A) combineReducers(), B) mergeReducers(), C) combineReducers, D) redux.combine()");
        answers.add("A) combineReducers()");

        questions.add("What is the purpose of Redux DevTools?");
        options.add("A) Manage state, B) Debug Redux applications, C) Optimize performance, D) Write reducers");
        answers.add("B) Debug Redux applications");

        questions.add("How do you enable Redux DevTools extension in a Redux application?");
        options.add("A) Use redux.enableDevTools(), B) Configure in middleware, C) Install redux-devtools-extension, D) Use Redux CLI");
        answers.add("C) Install redux-devtools-extension");

        questions.add("What is the recommended way to structure Redux actions?");
        options.add("A) In a single file, B) In separate files by feature, C) In reducers, D) In middleware");
        answers.add("B) In separate files by feature");

        questions.add("Which method is used to apply middleware in Redux?");
        options.add("A) redux.useMiddleware(), B) applyMiddleware(), C) applyMiddleware, D) useMiddleware()");
        answers.add("B) applyMiddleware()");

        questions.add("How do you handle immutable state in Redux?");
        options.add("A) Use mutable state, B) Use Immutable.js, C) Use regular JavaScript objects, D) Use Redux state");
        answers.add("C) Use regular JavaScript objects");

        questions.add("What is the purpose of the useSelector hook in React Redux?");
        options.add("A) Dispatch actions, B) Subscribe to store updates, C) Select parts of state, D) Connect components");
        answers.add("C) Select parts of state");

        questions.add("How do you subscribe to store updates in React Redux?");
        options.add("A) Use mapStateToProps, B) Use store.subscribe, C) Use useEffect, D) Use useSelector");
        answers.add("A) Use mapStateToProps");

        questions.add("Which method is used to bind action creators in React Redux?");
        options.add("A) bindActions, B) bindActionCreators, C) connectActions, D) redux.bindActions()");
        answers.add("B) bindActionCreators");

        questions.add("What is the purpose of the Provider component in React Redux?");
        options.add("A) Provide actions, B) Provide reducers, C) Provide store, D) Provide middleware");
        answers.add("C) Provide store");

        questions.add("How do you handle complex state logic in Redux?");
        options.add("A) Use useEffect, B) Use redux-thunk, C) Use selectors, D) Use Redux DevTools");
        answers.add("C) Use selectors");

        questions.add("What is the purpose of action types in Redux?");
        options.add("A) Define actions, B) Define reducers, C) Define middleware, D) Define state");
        answers.add("A) Define actions");

        questions.add("Which tool can be used for managing side effects in Redux?");
        options.add("A) Redux Thunk, B) Redux DevTools, C) Redux Logger, D) Redux Saga");
        answers.add("D) Redux Saga");

        questions.add("How do you handle async actions in Redux?");
        options.add("A) Use mapStateToProps, B) Use async reducers, C) Use middleware like Redux Thunk, D) Use action creators");
        answers.add("C) Use middleware like Redux Thunk");

        questions.add("Which function is used to define selectors in Redux?");
        options.add("A) createSelector(), B) defineSelector(), C) createSelectors(), D) redux.createSelector()");
        answers.add("A) createSelector()");

        questions.add("How do you manage forms in Redux?");
        options.add("A) Use useEffect, B) Use redux-form library, C) Use useSelector, D) Use mapStateToProps");
        answers.add("B) Use redux-form library");

        questions.add("Which method is used to create store enhancers in Redux?");
        options.add("A) createEnhancer(), B) applyMiddleware(), C) createStoreEnhancer(), D) compose()");
        answers.add("D) compose()");

        questions.add("How do you handle routing in Redux applications?");
        options.add("A) Use useEffect, B) Use react-router library, C) Use useSelector, D) Use mapStateToProps");
        answers.add("B) Use react-router library");


    }

    public static void main(String[]args){
        new Redux_Quiz(name).setVisible(true);
    }
    
}


