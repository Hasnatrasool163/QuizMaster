
package ninthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class SEO_Quiz extends Quiz{
    

    public SEO_Quiz(String name) {
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

// questions:98
    @Override
    public final void loadQuestions() {
        
questions.add(" When developing a backlink strategy, what approach would be most beneficial?");
options.add("A)Guest post the article to as many sites as possible, B)Create an infographics and share it with relevant bloggers, C)Create diverse and unnatural links, D)Distribute links in comment sections of websites");
answers.add("A)Guest post the article to as many sites as possible");

questions.add(" What is a key reason the URL `domain.com/apparel/jackets` is preferable to the URL `domain.com/p=141`?");
options.add("A)It is longer, B)It is not preferable, C)It uses structured markup, D)It is readable to a human");
answers.add("D)It is readable to a human");

questions.add(" Which HTTP response status code would indicate a page has been moved permanently?");
options.add("A)410, B)302, C)200, D)301");
answers.add("D)301");

questions.add(" You notice a website is serving HTML to a Search Engine than to a human user. What is this an example of?");
options.add("A)Spam injection, B)Cloaking, C)Sneaky Redirect, D)Splicing");
answers.add("B)Cloaking");

questions.add(" What would significantly improve Google&#39;s ability to a non-YouTube video in its Search Results?");
options.add("A)Provide a 150 x 80 pixel thumbnail image, B)Add Schema.org VideoObject, C)Convert .mp4 videos to .mov, D)Embed video objects with JavaScript conditionals");
answers.add("B)Add Schema.org VideoObject");

questions.add(" Google primarily determines indexing and ranking by crawling which version of a page?");
options.add("A)Responsive version, B)Submitted version, C)Mobile version, D)Desktop version");
answers.add("A)Responsive version");

questions.add(" You want to identify which US state has the most search interest for a particular keyword. What tool would help you determine this?");
options.add("A)Google Analytics, B)Google Keyword Planner, C)Google Search Console, D)Google Trends");
answers.add("D)Google Trends");

questions.add(" Which result is most likely if you use an interstitial pop-up that requires a user to take action before you load the content of the page?");
options.add("A)Both the pop-up and the content of the page will be indexed, B)The pop-up will be indexed instead of the desired body content, C)An interstitial pop-up is treated the same as a soft 404, D)The pop-up will be ignored and the content of the page will be indexed correctly");
answers.add("B)The pop-up will be indexed instead of the desired body content");

questions.add(" You notice a particular product in an e-commerce storefront is no longer indexed, despite no technical issues. What is a likely reason for this?");
options.add("A)No title or meta description tags were provided, B)The Keywords is too competitive, C)Robots.txt is configured to allow access, D)The product is out of stock");
answers.add("A)No title or meta description tags were provided");

questions.add(" All byline dates for articles are suddenly no longer visible on a `website&#39;s` listing within Google Search. Assuming no changes have been made to the site programming or content, what is the most likely cause?");
options.add("A)The site has been delisted from Google Search, B)A Google News sitemap was not provided within 30 days of setting up a publisher center account, C)The site kept updating the dates to make the content appear fres without changing, D)The articles have aged more than 365 days without any significant updates to the content or the site");
answers.add("C)The site kept updating the dates to make the content appear fres, without changing");

questions.add(" Which approach is not advisable to Geo-targeting your website?");
options.add("A)Using a gTLD with subdomain, B)using URL parameters, C)Using a ccTLD, D)Using a gTLD with a subdirectory");
answers.add("B)using URL parameters");

questions.add(" You have been asked to help a big e-commerce brand optimize their website for search engines. They currently have thousands of products listed on their website. What is your most appropriate first step?");
options.add("A)Recommend that they add more products, B)Work on compressing image files, C)302 redirect all product pages to URL that contains target keywords, D)Register the business with a Google My Business account.");
answers.add("B)Work on compressing image files");

questions.add(" What Does The Term &quot;Sandbox&quot; Mean In SEO?");
options.add("A)The Box With Paid Ads That Appear When You Perform A Search., B)This Is Where Sites Are Kept Till They Get Mature Enough To Be Included In The Top Rankings For A Particular Keyword, C)A Special Category Of Sites That Are Listed In Kid-safe Searches, D)The First 10 Search Results For A Particular Keyword.");
answers.add("B)This Is Where Sites Are Kept Till They Get Mature Enough To Be Included In The Top Rankings For A Particular Keyword");

questions.add(" What Is Anchor Text?");
options.add("A)It Is The Main Body Of Text On A Particular Web Page, B)It Is The Text Within The Left Or Top Panel Of A Web Page, C)It Is The Visible Text That Is Hyper Linked To Another Page, D)It Is The Most Prominent Text On The Page That The Search Engines Use To Assign A Title To The Page");
answers.add("C)It Is The Visible Text That Is Hyper Linked To Another Page");

questions.add(" Which Google search query should be used to return only PDF documents that reference Microsoft?");
options.add("A)Microsoft + .pdf, B)Microsoft + pdf, C)Microsoft AND pdf, D)Microsoft filetype:pdf");
answers.add("D)Microsoft filetype:pdf");

questions.add(" All byline dates articles are suddenly no longer visible on a website's listing within Google Search. Assuming no changes have been made to the site programming or content, what is the most likely cause?");
options.add("A)The site has been delisted from Google Search, B)The site kept updating the date to make the content appear fresh without changing the content., C)The articles have aged more than 365 days without any significant updates to the content or the site., D)A Google New sitemap was not provided within 30 days of setting up a Publisher Center account");
answers.add("B)The site kept updating the date to make the content appear fresh, without changing the content.");

questions.add(" What is an example of a Google search result that can be found in position zero?");
options.add("A)Google Ads result, B)featured snippet, C)related searches, D)autocomplete");
answers.add("B)featured snippet");

questions.add(" When creating accessible video content, what should you consider including?");
options.add("A)transcript, B)thumbnail, C)Flash Player, D)event tracking");
answers.add("A)transcript");

questions.add(" You are optimizing a website that sells supplies for banking donuts. Which approach is most appropriate to drive more organic traffic?");
options.add("A)Buy donutbakingsupplies.com and 301 redirect to your website, B)Add the keyword donut supplies to every page., C)Create a new blog with high-quality donut recipes, D)Join a link farm to rapidly build inbounnd links.");
answers.add("C)Create a new blog with high-quality donut recipes");

questions.add(" Why is it important to be mindful of outbound follow links?");
options.add("A)There is a limit to how many links you can create., B)all of these answers, C)Any follow links reduce your PageRank by 1., D)Your site's reputation is tied to the sites you link to.");
answers.add("D)Your site's reputation is tied to the sites you link to.");

questions.add(" Which statement is true about JSON-LD?");
options.add("A)It has no relation to JSON., B)It is the only structured data format available., C)It is considered the most complicated approach to adding structured data., D)It is Google's preferred structured data format.");
answers.add("D)It is Google's preferred structured data format.");

questions.add(" What is a key reason why duplicate content might cause an issue with ranking?");
options.add("A)It creates an inability to use canonical URLs which dramatically reduces crawl effectiveness, B)It requires using a 302 redirect which dilutes PageRank., C)It triggers an immediate manual action penalty which delists an entire domain until the duplicate content is removed., D)It makes it difficult for a search engine to determine the original and authoritative content source.");
answers.add("D)It makes it difficult for a search engine to determine the original and authoritative content source.");

questions.add(" What attribute would you use to describe the content of an image?");
options.add("A)tabindex, B)longdesc, C)src, D)alt");
answers.add("D)alt");

questions.add(" You are researching keywords for a client and creating list for an optimization plan. Which is _not_ a recommended method of creating keyword lists?");
options.add("A)synonyms and related words, B)queries about benefits features problems, C)how-to and question-based queries, D)focusing on only high-volume high-popularity words");
answers.add("D)focusing on only high-volume, high-popularity words");

questions.add(" You want to get a rough idea of how many searches per month a particular search term gets. Which tool do you use?");
options.add("A)Google Keyword Planner, B)Google Tag Manager, C)Google Search Console, D)Google Suggest");
answers.add("A)Google Keyword Planner");

questions.add(" Changing the title tag and/or meta description will have a measurable impact on your_______.");
options.add("A)RSS, B)CTR, C)PPC, D)LSI");
answers.add("B)CTR");

questions.add(" How do keywords change as people progress through the buying cycle?");
options.add("A)They move from simple to more complex as searchers gather more information and then refine their choices., B)The stay simple as searchers try to use as few words as possible., C)The keywords do not change much at all., D)They move from complex to simple as searchers find answers to their questions.");
answers.add("A)They move from simple to more complex as searchers gather more information and then refine their choices.");

questions.add(" Which technique is an example of black hat SEO?");
options.add("A)cloaking, B)keyword research, C)useful content, D)on-page optimization");
answers.add("A)cloaking");

questions.add(" A local accountant wants to start attracting more business directly from Google organic search. What is the best piece of advice to give to her?");
options.add("A)Use the pharse local accountant as a keyword to focus her website on., B)Focus on short-tail keywords., C)Register her business with a Google Business Profile account., D)Leave a link to her website in the blog comments of popular accounting websites.");
answers.add("C)Register her business with a Google Business Profile account.");

questions.add(" What is the anchor text in this code sample? <a href=\"catalog/gloves.html\">Blue Gloves</a>`");
options.add("A)Blue Gloves, B)href, C)catalog/, D)gloves.html");
answers.add("A)Blue Gloves");

questions.add(" **_____** analysis allows you to review requests made to your web server to identify insights such as how ofter a crawler arrives, what pages have 404 errors, and most crawled pages");
options.add("A)Log file, B)HTTP/2, C)Cron job, D)Resource packet");
answers.add("A)Log file");

questions.add(" Which page title references content that is evergreen");
options.add("A)Mega List of Teams Going to the Olympics, B)Complete Coverage of Microsoft's Latest Announcement, C)The Future of SEO in 2020, D)How to Reheat Pizza");
answers.add("D)How to Reheat Pizza");

questions.add(" You load a page and start reading an article, and suddenly the content on the page moves. What metric is used to quantify this impact on user experience?");
options.add("A)First Meaningful Paint (FMP), B)Recalculated Style Timing (RST), C)Latent Loading Signal (LLS), D)Cumulative Layout Shift (CLS)");
answers.add("D)Cumulative Layout Shift (CLS)");

questions.add(" Which search query would be most difficult to determine search intent?");
options.add("A)XBox live coupon, B)Microsoft Office 365, C)LinkedIn login, D)LAX airport directions");
answers.add("B)Microsoft Office 365");

questions.add(" When you conduct a search, what are the bolded words within the search listing description?");
options.add("A)suggested search terms, B)related search queries, C)keywords that match the search query, D)words with a `<b>` tag assigned in their meta description");
answers.add("C)keywords that match the search query");

questions.add(" Which acronym is used to describe the page a user sees after submitting a search?");
options.add("A)SERP (Search Engine Results Page), B)INDX, C)PARS, D)SEM");
answers.add("A)SERP (Search Engine Results Page)");

questions.add(" Which statement is true regarding the use of social signals, such as LinkedIn shares, by Google in its ranking algorithm?");
options.add("A)Google does not use social signals to determine rank, B)Social signals are identical to backlinks, C)Social signals are used to determine topic authority, D)Social signals provide a benefit only if they have structured data markup");
answers.add("C)Social signals are used to determine topic authority");

questions.add(" A user clicks an internal link resulting in this redirect chain: `http://domain.com -> https://domain.com -> https://domain.com/`. In this example, what is being consumed unnecessarily?");
options.add("A)redirect allotment, B)crawl budget, C)velocity scale, D)domain authority");
answers.add("A)redirect allotment");

questions.add(" You are planning for the development of an e-commerce website. Which approach will be more beneficial for rankings?");
options.add("A)Optimize the front page of your website to drive traffic from all category search terms., B)Optimize product category pages to drive traffic from individual category search terms., C)Optimize all pages on the site for all category search terms., D)Optimize product pages to drive traffic from individual category search terms.");
answers.add("C)Optimize all pages on the site for all category search terms.");

questions.add(" What is the relationship of click depth to PageRank?");
options.add("A)The deeper the click depth the lower the PageRank, B)PageRank and click depth have no relation, C)The deeper the click depth the higher the PageRank, D)Click depth and PageRank are equal");
answers.add("A)The deeper the click depth the lower the PageRank");

questions.add(" What is a popular technique for writing content with the goal of having it appear in a features snippet?");
options.add("A)Write the question in a headline tag and then answer it below in a format that matches the snippet type., B)Use the features snippet schema and apply an object that matches the correct snippet type., C)Google manually generates featured snippets so there is no special technique., D)Submit the content through Google Search Console and tag it with the correct snippet type.");
answers.add("A)Write the question in a headline tag and then answer it below in a format that matches the snippet type.");

questions.add(" What is a common best practice for handling search result pages on a blog's built-in site search?");
options.add("A)Set site research results to no-index., B)Do not use site search., C)Set site search to 404., D)Add a canonical from the search result page to the home page.");
answers.add("A)Set site research results to no-index.");

questions.add(" What might help a search engine understand the difference between an article on a dog bark versus tree bark?");
options.add("A)tertiary analysis, B)ranked choice trees, C)semantic analysis, D)knowledge graphs");
answers.add("C)semantic analysis");

questions.add(" A webpage has this tag: `<title>Brad's Bagels: How to Bake a Bagel</title>`. However, the Google search result for this page displays this title: ___ Brad's Bagels: Baking Bagels in the Oven ____. What is a likely explanation?");
options.add("A)The title tag was placed within the <HEAD> section of the webpage but not before the meta content tags so Google cannot identify the actual title., B)The page is using structured data to define an alternative title object which allows the search engine to pick a preferable version., C)A breadcrumb navigation is in use which overrides the title tag supplied in the HTML., D)Google generated a new title using text on the page that more closely matched the search query.");
answers.add("B)The page is using structured data to define an alternative title object, which allows the search engine to pick a preferable version.");

questions.add(" Your site serves identical content when you visit domain.com/page or domain.com/page?ref=123. What should you implement?");
options.add("A)parameter stripping, B)URL cloaking, C)a 302 redirect, D)a rel=canonical link");
answers.add("D)a rel=canonical link");

questions.add(" What data vocabulary is most commonly used when marking up content on a page?");
options.add("A)vocabulary.org, B)RDFa.org, C)schema.org, D)data-vocabulary.org");
answers.add("C)schema.org");

questions.add(" According to Google, what type of content includes topics such as news, legal issues, financial advice, and medical information?");
options.add("A)RSS, B)KYC, C)YMYL, D)BDB");
answers.add("C)YMYL");

questions.add(" When would it be necessary to 301 redirect every page on a site?");
options.add("A)when parameters are used in URLs, B)when migrating from HTTP to HTTPS, C)when launching a new redesign, D)when creating a new subdomain");
answers.add("B)when migrating from HTTP to HTTPS");

questions.add(" What would contribute to a low bounce rate?");
options.add("A)Content does not match search intent., B)Page returns 404 error., C)Content reflects search intent., D)URL uses parameters.");
answers.add("C)Content reflects search intent.");

questions.add(" What should be as consistent as possible across the web when developing a local SEO strategy?");
options.add("A)backlinks, B)NAP, C)LRP, D)inbound links");
answers.add("B)NAP");

questions.add(" A user enters a search _______- to retrieve results from a search engine?");
options.add("A)query, B)parser, C)bar, D)link");
answers.add("A)query");

questions.add(" The search query \"How to make donuts without yeast\" is an example of what?");
options.add("A)fresh keyword, B)operative keyword, C)short-tail keyword, D)long-tail keyword");
answers.add("D)long-tail keyword");

questions.add(" What tool enables companies to display extra information within the natural search results without the need of any structured data?");
options.add("A)Google Input Tools, B)structured data testing tool, C)Google Tag Manager, D)Google My Business");
answers.add("D)Google My Business");

questions.add(" Your client is ready to start a blog. but has read that they should put the blog on a subdomain instead of subdirectory in order to create more external links to their website. How would you advise your client about this strategy?");
options.add("A)Not only should the blog be on a subdomain but each of the major navigation areas should be on separate subdomains in order to increase the number and value of the links into the primary domain., B)It is best to have the blog on a subdirectory and build links to primary domain., C)It is an advisable choice as it will enable interlinking between the domains and increase the number of links., D)The blog should be on a separate URL to avouud building too many links between the same domain or IP.");
answers.add("B)It is best to have the blog on a subdirectory and build links to primary domain.");

questions.add(" Blog author pages, each with only one sentence about the author, are at risk of being flagged as **______** content.");
options.add("A)non-indexable, B)irrelevant, C)biased, D)thin");
answers.add("D)thin");

questions.add(" What is a common benefit to long-tail keywords?");
options.add("A)They are less competitive and may have higher conversion rates., B)Long-tail keywords are no longer relevant in today's SEO landscape., C)They are less grandular so you capture broader searches., D)They are more competitive but drive significantly more traffic.");
answers.add("A)They are less competitive and may have higher conversion rates.");

questions.add(" You have been asked to help a big e-commerce brand optimize their website for search engines. They currently have thousands of products listed on their website. What is your most appropriate first step?");
options.add("A)Set campaign goals., B)Conduct a technical audit., C)Conduct a backlink audit., D)Determine keyword strategy.");
answers.add("C)Conduct a technical audit.");

questions.add(" You are optimizing a large e-commerce website. Which strategy will likely yield the most organic traffic?");
options.add("A)Launch a Smart Shopping Campaign in Google Ads., B)Optimize the home page of your website., C)Optimize each product page with a unique product-specific keyword., D)Optimize your product category pages.");
answers.add("C)Optimize each product page with a unique product-specific keyword.");

questions.add(" Google's Search Quality Evaluator Guidelines describe that experts should write content, especially YMYL content. This is one of the principles seen in the commonly used acronym ________");
options.add("A)A.C.E, B)L-E-A-F, C)T.R.U.S.T.E.D, D)E-A-T");
answers.add("D)E-A-T");

questions.add(" Why might using a subdirectory in place of a subdomain be beneficial?");
options.add("A)Using a subdirectory is never preferable to using a subdomain., B)The subdirectory will allow for keyword dilution., C)The subdirectory will benefit from the backlinks the domain has acquired., D)The subdirectory is better for the end user experience.");
answers.add("C)The subdirectory will benefit from the backlinks the domain has acquired.");

questions.add(" What is the best way to provide a search engine with crawl instructions?");
options.add("A)Use the <crawl> tag., B)Use the search engine's Remove URL tool., C)Use a robots.txt file., D)Use structured data");
answers.add("C)Use a robots.txt file.");

questions.add(" You are optimizing a site that receives a lot of user-submitted comments, many of which contain a promotional links. According to SEO best practices, how should you treat the comments?");
options.add("A)Be sure links are using keywork-rich anchor tags, B)Disallow each link submitted, C)Set links in comments to be Nofollow, D)Bold important keywords in comments");
answers.add("C)Set links in comments to be Nofollow");

questions.add(" What is not a primary component of a SERP snippet?");
options.add("A)Description, B)Title, C)Cache, D)URL");
answers.add("C)Cache");

questions.add(" A landing page with no internal or external links is an example of what?");
options.add("A)Dynamic hierarchy, B)Doorway content, C)Orphaned content, D)Flat Hierarchy");
answers.add("C)Orphaned content");

questions.add(" Informational, navigational, commercial, transactional are four categories of what?");
options.add("A)keyword search intent, B)crawling, C)indexing, D)HTTP responses");
answers.add("A)keyword search intent");

questions.add(" How many H1 tags are typically found on a single page?");
options.add("A)up to five, B)one, C)as many as necessary, D)two");
answers.add("B)one");

questions.add(" What is a meta description used for?");
options.add("A)to summarize the content of a webpage, B)to bundle meta tags, C)to describe images, D)to assign schema markup");
answers.add("A)to summarize the content of a webpage");

questions.add(" Which tool would be best to use to research how many searches per month a term gets?");
options.add("A)Google Search Console, B)Google Suggest, C)Google Keyword Planner, D)Google Tag Manager");
answers.add("C)Google Keyword Planner");

questions.add(" What is an example of a top-level domain (TLD)?");
options.add("A).net, B)domain.ai, C)www, D)301");
answers.add("A).net");

questions.add(" What does the 301 server response code signify?");
options.add("A)Not Modified, B)Moved Permanently, C)Payment is required, D)Syntax error in the request");
answers.add("B)Moved Permanently");

questions.add(" What tag should you use to signal the main topic heading of a page?");
options.add("A)`<h1>`, B)`<h0>`, C)`<strong>`, D)`<em>`");
answers.add("A)`<h1>`");

questions.add(" What term is typically used to explain the shuffling of positions in search engine results in between significant updates?");
options.add("A)Flux, B)Waves, C)Swaying, D)Shuffling");
answers.add("A)Flux");

questions.add(" Which of the following declarations about FFA web pages are true?");
options.add("A)They are paid listings., B)They are also called link farms., C)They are significantly beneficial to search engine optimization., D)They contain various inbound links.");
answers.add("B)They are also called link farms.");

questions.add(" What is the generally approved distinction in between SEO and also SEM?");
options.add("A)SEO refers to organic/natural listings while sem covers pay per click or paid search., B)Search engine optimization focuses on organic/natural search positions sem encompasses all facets of search marketing., C)No difference they're synonymous., D)SEO has a tendency to be a west shore term sem is much more eastern shore.");
answers.add("B)Search engine optimization focuses on organic/natural search positions, sem encompasses all facets of search marketing.");

questions.add(" Which of the following link building techniques do online search engine tacitly recommend?");
options.add("A)Reciprocal link exchange programs., B)Viral content creation & promotion., C)Renting out pages from trustworthy domains and also positioning web links on them., D)Purchasing web links from web link brokers & networks.");
answers.add("B)Viral content creation & promotion.");

questions.add(" What is the full form of SEO?");
options.add("A)Search Engine Optimum., B)Search Engine Optimization., C)Search Electronic Optimization., D)None of the above.");
answers.add("B)Search Engine Optimization.");

questions.add(" Which of the following is the process of fetching all the web pages connected to a web site?");
options.add("A)Indexing, B)Crawling, C)Processing, D)All of the Above");
answers.add("B)Crawling");

questions.add(" What does the 302 server response code signify?");
options.add("A)It symbolizes dispute way too many individuals desired the exact same documents at the same time., B)The web page has actually been permanently removed., C)The technique you are making use of to access the file is not allowed., D)The web page has actually temporarily moved.");
answers.add("D)The web page has actually temporarily moved.");

questions.add(" Which of the following declarations about RSS are proper?");
options.add("A)It is a form of XML., B)It stands for Realtime streamlined syndication., C)It is an excellent way of presenting static information., D)It is a microsoft technology.");
answers.add("A)It is a form of XML.");

questions.add(" Which of the following search engines or directories supplies the major search results for AOL?");
options.add("A)Lycos, B)DMOZ, C)Google, D)Yahoo");
answers.add("C)Google");

questions.add(" Google gives priority to themed in-bound links.");
options.add("A)True, B)False, C)maybe, D)no way");
answers.add("A)True");

questions.add(" Which of the following methods can help you get around the Google Sandbox?");
options.add("A)Buying an old Website as well as getting it ranked., B)Buying a Google Adwords PPC campaign., C)Placing the website on a sub domain of a ranked site and afterwards 301 re-directing the site after it has actually been indexed., D)Getting a DMOZ listing.");
answers.add("A)Buying an old Website as well as getting it ranked.");

questions.add(" Google looks down upon paid links for enhancing page ranking. If a web site sells web links, what action/s does Google suggest to avoid being penalized?");
options.add("A)The text of the paid links should state words paid text link for Google to recognize it as a paid web link., B)Only Paid text web links to non profit websites should be accepted., C)Paid links need to be divulged via the rel= nofollow attribute in the hyperlink., D)Paid links ought to be disclosed through the index= nofollow attribute in the hyperlink.");
answers.add("C)Paid links need to be divulged via the rel= nofollow attribute in the hyperlink.");

questions.add(" What will take place if you type the word 'Certification-Python' in the Google search box?");
options.add("A)Google will certainly locate the web pages about certification and additionally consisting of the word python., B)Google will certainly locate ALL the web pages having the word Certification and Python., C)Google will locate ALL the web pages in which the words Certification and Python appear together., D)Google will find the web pages about Certification that do not consist of the word Python.");
answers.add("C)Google will locate ALL the web pages in which the words Certification and Python appear together.");

questions.add(" What is keyword density?");
options.add("A)The number of times the keyword is utilized/ (separated by) the total word count on page-(minus) the complete words in HTML on the page., B)The variety of times the keyword is used x (multiply by) the total word count on web page., C)The number of times the keyword is utilized in the page description., D)The number of times the search phrase is used in the web page title.");
answers.add("A)The number of times the keyword is utilized/ (separated by) the total word count on page-(minus) the complete words in HTML on the page.");

questions.add(" Which of the following statement about FFA web pages hold true?");
options.add("A)They are significantly beneficial to SEO., B)They are additionally called Link Farms., C)They are Paid Listings., D)They contain various incoming links.");
answers.add("b)They are additionally called Link Farms.");

questions.add(" What elements of a hyperlink are not important for SEO?");
options.add("A)The exposure of the link text., B)The anchor text particularly the keywords in it., C)The area from which the web link stems., D)The location to which the link leads.");
answers.add("A)The exposure of the link text.");

questions.add(" Which HTTP web server reaction code suggests a file that no more exists? (File Not Found).");
options.add("A)40A, B)30A, C)500, D)404");
answers.add("A)404");

questions.add(" What is Page Rank?");
options.add("A)The Alexa modern technology for ranking web pages., B)The means Yahoo! actions just how popular an offered web page is based on the number as well as quality of websites that connect to it., C)The search significance of a web page contrasted to the other web pages in the online search engine., D)The method Google measures exactly how popular a provided page is based upon the number and also quality of sites that connect to it.");
answers.add("D)The method Google measures exactly how popular a provided page is based upon the number and also quality of sites that connect to it.");

questions.add(" Your sitemap shows this entry: <lastmod>2020-09-09T19:34:00+01:00</lastmod>. What does +01:00 refer to?");
options.add("A)time between publishing and updating, B)time since last sitemap crawl, C)time zone designator, D)suggested content priority");
answers.add("C)time zone designator");

questions.add(" What markup language is most commonly used for sitemaps?");
options.add("A)RSS, B)XLS, C)Javascript, D)XML");
answers.add("D)XML");

questions.add(" What markup language is most commonly used for sitemaps?");
options.add("A)RSS, B)XLS, C)Javascript, D)XML");
answers.add("A)XML");

questions.add(" You are searching for a website that was published within last week. When you type in the URL, the site does not appear in Google search results. Why might this be?");
options.add("A)You are searching on desktop and must wait for mobile-first indexing, B)The site is not in Google's index, C)The website needs backling to be discovered by Googlebot, D)The website does not have a high enough domain authority");
answers.add("B)The site is not in Google's index");

questions.add(" In which scenario is using a 301 redirect preferred over a canonical link?");
options.add("A)When using faceted navigation, B)when treating uppercase versus lowercase characters in URLs, C)with an on-site search results page, D)when managing URL parameters");
answers.add("B)when treating uppercase versus lowercase characters in URLs");

questions.add(" What would be most beneficial in helping a site display rich features in Google's search results?");
options.add("A)Google search console, B)structured data, C)Data-Vocabulary.org, D)Google Result Generator");
answers.add("B)structured data");

questions.add(" Which statement is true regarding the use of social signals, such as LinkedIn shares, by Google in its ranking algorithm?");
options.add("A)Social signals provide a benefit only if they have structured data markup, B)Social signals are identical to backlinks, C)Google does not use social signals to determine rank, D)Social signals are used to determine topic authority");
answers.add("D)Social signals are used to determine topic authority");

questions.add(" How many outbound links should you include in each blog posting?");
options.add("A)at least 2, B)at least five, C)at least seven, D)as many as are relevent");
answers.add("D)as many as are relevent");

questions.add(" What is the best type of domain name for a new business to use?");
options.add("A)an exact match domain name, B)a partial match domain name, C)a broad match domain name, D)a domain name that fits their branding");
answers.add("D)a domain name that fits their branding");

    }
    

    public static void main(String[]args){
        new SEO_Quiz(name).setVisible(true);
    }
    
}