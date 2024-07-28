
package eleventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Requests_Quiz extends Quiz{
    

    public Requests_Quiz(String name) {
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


    // questions: 32
    @Override
    public final void loadQuestions() {

        questions.add("What is Requests library used for in Python?");
        options.add("A) Web scraping, B) Database management, C) GUI development, D) File handling");
        answers.add("A) Web scraping");

        questions.add("How do you install Requests library in Python?");
        options.add("A) pip install requests, B) pip install req, C) python install requests, D) python get requests");
        answers.add("A) pip install requests");

        questions.add("Which HTTP methods are supported by Requests library?");
        options.add("A) GET POST PUT DELETE, B) FETCH PUSH POP SLIDE, C) READ WRITE DELETE, D) REQUEST RESPONSE HANDLE");
        answers.add("A) GET POST PUT DELETE");

        questions.add("How do you send a GET request using Requests?");
        options.add("A) requests.get(url), B) requests.request('GET' url), C) requests.send('GET' url), D) requests.fetch(url)");
        answers.add("A) requests.get(url)");

        questions.add("Which parameter is used to send data in a POST request with Requests?");
        options.add("A) params, B) data, C) body, D) form");
        answers.add("B) data");

        questions.add("How do you add headers to a Requests GET request?");
        options.add("A) requests.get(url headers={'key': 'value'}), B) requests.headers(url {'key': 'value'}), C) requests.add_headers(url {'key': 'value'}), D) requests.header(url {'key': 'value'})");
        answers.add("A) requests.get(url headers={'key': 'value'})");

        questions.add("What does the status_code attribute represent in a Requests response?");
        options.add("A) Time taken for the request, B) URL of the request, C) HTTP status code of the response, D) Content of the response");
        answers.add("C) HTTP status code of the response");
        
        questions.add("How do you handle JSON response data in Requests?");
        options.add("A) response.json(), B) response.parse_json(), C) response.get_json(), D) response.decode_json()");
        answers.add("A) response.json()");

        questions.add("How do you handle a response with XML content type in Requests?");
        options.add("A) response.xml(), B) response.parse_xml(), C) response.content, D) response.text");
        answers.add("D) response.text");

        questions.add("Which attribute is used to access cookies in a Requests response?");
        options.add("A) response.cookie, B) response.cookies, C) response.get_cookies, D) response.cookiejar");
        answers.add("B) response.cookies");

        questions.add("How do you handle a response with text content in Requests?");
        options.add("A) response.text, B) response.content, C) response.body, D) response.read()");
        answers.add("A) response.text");

        questions.add("What does the history attribute represent in a Requests response?");
        options.add("A) Request history, B) Response history, C) Status history, D) Time history");
        answers.add("B) Response history");

        questions.add("Which method is used to send a HEAD request using Requests?");
        options.add("A) requests.head(url), B) requests.send('HEAD' url), C) requests.request('HEAD' url), D) requests.get(url)");
        answers.add("A) requests.head(url)");

        questions.add("How do you handle response headers in Requests?");
        options.add("A) response.headers, B) response.get_headers, C) response.header, D) response.get_header");
        answers.add("A) response.headers");

        questions.add("Which attribute is used to access response content in Requests?");
        options.add("A) response.text, B) response.content, C) response.body, D) response.data");
        answers.add("B) response.content");

        questions.add("How do you handle a response with binary content in Requests?");
        options.add("A) response.binary(), B) response.read_binary(), C) response.content, D) response.raw");
        answers.add("D) response.raw");

        questions.add("Which method is used to send a PATCH request using Requests?");
        options.add("A) requests.patch(url), B) requests.send('PATCH' url), C) requests.modify(url), D) requests.request('PATCH' url)");
        answers.add("A) requests.patch(url)");

        questions.add("How do you handle HTTP errors in Requests?");
        options.add("A) response.handle_errors(), B) response.error(), C) response.raise_for_status(), D) response.handle_http_errors()");
        answers.add("C) response.raise_for_status()");

        questions.add("Which parameter is used to send custom headers in Requests?");
        options.add("A) headers, B) params, C) data, D) body");
        answers.add("A) headers");

        questions.add("How do you handle a response with non-JSON content type in Requests?");
        options.add("A) response.parse(), B) response.content(), C) response.read(), D) response.text()");
        answers.add("C) response.read()");

        questions.add("What does the raise_for_status() method do in Requests?");
        options.add("A) Raises an exception if status code is 200, B) Raises an exception if status code is not 200, C) Raises an exception if no response, D) Raises an exception if connection fails");
        answers.add("B) Raises an exception if status code is not 200");

        questions.add("How do you handle redirection in Requests?");
        options.add("A) requests.follow_redirects = True, B) requests.allow_redirects = True, C) requests.redirect(True), D) requests.redirect_follow(True)");
        answers.add("B) requests.allow_redirects = True");

        questions.add("Which parameter is used to send URL parameters in Requests?");
        options.add("A) params, B) data, C) body, D) form");
        answers.add("A) params");

        questions.add("How do you handle authentication in Requests?");
        options.add("A) requests.auth = ('username' 'password'), B) requests.authenticate('username' 'password'), C) requests.set_auth('username' 'password'), D) requests.authenticate = ('username' 'password')");
        answers.add("A) requests.auth = ('username' 'password')");

        questions.add("Which method is used to send a DELETE request using Requests?");
        options.add("A) requests.delete(url) B) requests.remove(url), C) requests.send('DELETE' url), D) requests.request('DELETE' url)");
        answers.add("A) requests.delete(url)");

        questions.add("How do you handle a response with streaming content in Requests?");
        options.add("A) response.stream(), B) response.streaming_content(), C) response.content, D) response.read()");
        answers.add("B) response.streaming_content()");

        questions.add("Which method is used to send a PUT request using Requests?");
        options.add("A) requests.update(url), B) requests.send('PUT' url), C) requests.put(url), D) requests.request('PUT' url)");
        answers.add("C) requests.put(url)");

        questions.add("How do you handle a response with JSON content in Requests?");
        options.add("A) response.parse_json(), B) response.get_json(), C) response.json(), D) response.decode_json()");
        answers.add("C) response.json()");

        questions.add("Which method is used to send a POST request using Requests?");
        options.add("A) requests.post(url), B) requests.send('POST' url), C) requests.put(url), D) requests.request('POST' url)");
        answers.add("A) requests.post(url)");

        questions.add("How do you set a timeout for Requests?");
        options.add("A) requests.timeout = 10, B) requests.set_timeout(10), C) requests.timeout(10), D) requests.get(url timeout=10)");
        answers.add("D) requests.get(url timeout=10)");

        questions.add("What does the status_code attribute represent in a Requests response?");
        options.add("A) Time taken for the request, B) URL of the request, C) HTTP status code of the response, D) Content of the response");
        answers.add("C) HTTP status code of the response");

        questions.add("How do you handle response content in Requests?");
        options.add("A) response.text, B) response.content, C) response.body, D) All of the above");
        answers.add("D) All of the above");

    }
    

    public static void main(String[]args){
        new Requests_Quiz(name).setVisible(true);
    }
    
}


