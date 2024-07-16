package secondListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Accounting_Quiz extends Quiz {

    public Accounting_Quiz(String name) {
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

    // questions 
    @Override
    public final void loadQuestions() {

questions.add(" Which statement is not an advantage of robotic process automation (RPA)?");
options.add("A)  Bots are more creative than humans, B)    Bots do not need to take time off, C)    Bots improve efficiency, D)    Bots can eliminate human errors");
answers.add("A) Bots are more creative than humans");

questions.add(" What effect does a contra-asset account have on a balance sheet?");
options.add("A) A contra asset is not an accounting term, B)   A contra asset has a credit balance and therefore a negative effect on total assets, C)    A contra asset with a positive balance will increase overall liabilities, D)    A contra asset has a debit balance and therefore a positive effect on total assets");
answers.add("B) A contra asset has a credit balance and therefore a negative effect on total assets");

questions.add(" Internal controls may be preventative, detective, corrective, or directive. Which is a detective control?");
options.add("A) data backups, B)   physical inventory check, C)    employee background checks, D)    physical locks on inventory warehouse");
answers.add("B) physical inventory check");

questions.add(" On March 15, a business received an invoice from the power company for utilities used in February. The retailer paid the invoice on April 1. The business uses accrual-based accounting. Which month should the business recognize the expense?");
options.add("A) April, B)    March, C)    no record required, D)   February");
answers.add("D) February");

questions.add(" Which choice is a general guideline for adequate separation of duties to prevent both fraud and error?");
options.add("A) A person who has control over an asset should not safeguard that asset., B)    A person who has temporary or permanent custody of an asset should not account for that asset., C)   A person who has record-keeping responsibility should not make journal entries., D)    A person who has operational responsibility should not authorize transactions for the area.");
answers.add("C) A person who has record-keeping responsibility should not make journal entries.");

questions.add(" What does the cost of a unit of product under the absorption costing method consist of?");
options.add("A) direct materials direct and indirect labor and fixed overhead, B)    direct materials indirect labor and variable and fixed overhead, C)   direct materials direct labor and both variable and fixed overhead, D)    direct materials direct and indirect labor and variable overhead");
answers.add("C) direct materials direct labor and both variable and fixed overhead");

questions.add(" Which are accruals and deferrals?");
options.add("A) Accruals are past cash receipts and payments while deferrals are expected future cash receipts and payments., B)    Both accruals and deferrals are both expected future cash receipts and payments., C)   Accruals are expected future cash receipts and payments while deferrals are past cash receipts and payments., D)    Both accruals and deferrals are not expected past cash receipts and payments.");
answers.add("C) Accruals are expected future cash receipts and payments while deferrals are past cash receipts and payments.");

questions.add(" What do you call a situation where more than one person collaborates to circumvent existing internal controls?");
options.add("A) assigned responsibility, B)    segregation of duties, C)    fraud prevention, D)   collusion");
answers.add("D) collusion");

questions.add(" Which is not an example of an internal control activity?");
options.add("A)  review of manufacturing plan, B)    segregation of duties, C)    bank reconciliations, D)    approval process");
answers.add("A) review of manufacturing plan");

questions.add(" Which budgeting approach requests justification of all expenditures?");
options.add("A)  zero-based budgeting, B)    master budgeting, C)    rolling budgets, D)    bottom-up budgeting");
answers.add("A) zero-based budgeting");

questions.add(" What does the discontinued operations section of the income statement refer to?");
options.add("A)  disposal of a major product line or major geographical area of operations, B)    sale of unused or obsolete equipment and discontinued inventory, C)    plant shutdown or decommissioning of a facility, D)    net income or loss for products completed and sold");
answers.add("A) disposal of a major product line or major geographical area of operations");

questions.add(" How are the three financial statements (income statement, balance sheet, and cash flow statement) linked?");
options.add("A)   Only the assets are reflected in the cash flow statement and the net income expenses correlate with the liabilities., B)    The net income goes to retained earnings but the cash flow remains independent., C)    The gross profit goes to retained earnings and the shareholder equity total is added to the cash flow statement, D)   The net income goes to the retained earnings and the cash flow statement");
answers.add("D) The net income goes to the retained earnings and the cash flow statement");

questions.add(" Which is not one of the four perspectives of the balanced scorecard?");
options.add("A) internal business, B)    learning and growth, C)   quantitative, D)    customer");
answers.add("C) quantitative");

questions.add(" What would be deducted from the balance per book when doing a bank reconciliation?");
options.add("A) deposits in transit, B)    bank service fees, C)   outstanding checks, D)    electronic fund transfers/payments");
answers.add("C) outstanding checks");

questions.add(" What situation could be the result of the three retail store employees sharing the same cash register?");
options.add("A)   a thorough internal control activity, B)   a violation of assignment of responsibility, C)    a violation of segregation of duties, D)    a support process to avoid fraud");
answers.add("B) a violation of assignment of responsibility");

questions.add(" A firm has $1,000 in debt and $3,000 in assets. What is the firm's debt-to-equity ratio?");
options.add("A)   3, B)    2, C)    0.5, D)   0.33");
answers.add("D) 0.33");

questions.add(" An external auditor is required to be independent when performing");
options.add("A) all attestation services, B)    all professional services (wrong and includes consulting), C)    all tax services, D)    all consulting engagements (wrong answer)");
answers.add("A) all attestation services");

questions.add(" Proper segregation of functional responsibilities calls for the separation of");
options.add("A) custody payment and recording, B)    authorization custody and execution, C)   authorization custody and recording, D)    custody execution and payment");
answers.add("C) authorization custody and recording");

questions.add(" What does the degree of operating leverage represent?");
options.add("A) how much the value of capital assets will change in response to a change in sales, B)   how much the operating income of a company will change in response to a change in sales, C)    the valuation of assets to determine how much additional debt the company can borrow, D)    how much the sales of a company will change in response to a change in operating income");
answers.add("B) how much the operating income of a company will change in response to a change in sales");

questions.add(" Which characteristic would concern an auditor about the risk of material misstatements arising from fraudulent financial reporting?");
options.add("A) limited employee turnover within the accounting and finance department, B)   management's disregard of regulations and regulatory authorities, C)    regularly reported bank reconciliations including deposits in transit, D)    capital assets sold at a loss before being depreciated fully");
answers.add("B) management's disregard of regulations and regulatory authorities");

questions.add(" An employee who makes a sale, ships the goods, and bills the customer violates which control activity?");
options.add("A) assignment of responsibility, B)    audit verification, C)   segregation of duties, D)    review and reconciliation");
answers.add("C) segregation of duties");

questions.add(" What trait distinguishes auditors from accountants?");
options.add("A) The auditor can interpret accounting principles applicable to the country in which the client operates., B)    The auditor has extensive education beyond what is required for an accountant, C)    The auditor can adapt to a rapidly changing profession., D)   The auditor has expertise in the gathering and interpretation of audit evidence.");
answers.add("D) The auditor has expertise in the gathering and interpretation of audit evidence.");

questions.add(" What is the purpose of an operational audit?");
options.add("A) assessing the company's compliance with environmental laws and regulations, B)   evaluating whether the organization is meeting the metrics set by management to achieve the goals and objectives set forth by the board of directors, C)    assessing the organization's control mechanisms for overall efficiency and reliability, D)    evaluating compliance with applicable laws regulations policies and procedures");
answers.add("B) evaluating whether the organization is meeting the metrics set by management to achieve the goals and objectives set forth by the board of directors");

questions.add(" Which statement is false?");
options.add("A) The balanced scorecard aligns an organization's operational activities with its mission., B)    The balanced scorecard focuses on four primary areas: financial customer internal process and learning and growth. (def true), C)    The balanced scorecard measures tracks and reports on a balance of qualitative and financial data and metrics. (def true), D)   The balanced scorecard ensures the organization's profitability aligns with director compensation and dividend expectations.");
answers.add("D) The balanced scorecard ensures the organization's profitability aligns with director compensation and dividend expectations.");

questions.add(" Which choice is not a component of internal control?");
options.add("A) information and communication, B)   risk mitigation, C)    monitoring, D)    control environment");
answers.add("B) risk mitigation");

questions.add(" What is the difference between the cost of an asset and the accumulated depreciation for that asset?");
options.add("A) depreciation value, B)    prepaid asset, C)    depreciation expense, D)   book value");
answers.add("D) book value");

questions.add(" A company budgeted 1,200 washers, but only 1,000 are produced. It costs $10 to produce a widget. What is the material variance?");
options.add("A) 200, B)    2000, C)    350, D)    20");
answers.add("A) 200");

questions.add(" Who does an audit committee report to?");
options.add("A) external auditors, B)    senior management, C)    board of directors, D)    union of employee representatives");
answers.add("A) external auditors");

questions.add(" A business purchased office equipment by issuing a one-year note payable. The entire amount of the note is due at the end of one year. How do you record this transaction?");
options.add("A) Debt asset credit equity, B)    Debt liability credit asset., C)   Debit asset credit liability, D)    Debit equity credit asset.");
answers.add("C) Debit asset credit liability");

questions.add(" Which section of a financial annual report describes the corporation's accounting methods?");
options.add("A) Notes to the financial statements, B)    An auditor's report, C)    Listing of the stockholders, D)    Management discussion and analysis");
answers.add("A) Notes to the financial statements");

questions.add(" What does (independence) mean in auditing?");
options.add("A)  being an advocate for all clients, B)    not being dependent on a client's fee, C)    having only indirect financial interests in the auditee, D)   taking an unbiased viewpoint");
answers.add("D) taking an unbiased viewpoint");

questions.add(" What would cause a bank to increase a depositor's account?");
options.add("A) collecting a note receivable, B)   paying a note payable, C)    NSF checks -nonsufficient funds, D)    service changes");
answers.add("B) paying a note payable");

questions.add(" Which statement about current liabilities is true?");
options.add("A) Current liabilities are obligations owed after 12 months., B)    Current liabilities should be included under long-term liabilities., C)    Current liabilities are obligations owed over 5 years., D)   Current liabilities are obligations due within a year.");
answers.add("D) Current liabilities are obligations due within a year.");

questions.add(" How do variable costs and fixed costs act within the relevant range?");
options.add("A) Variable costs per unit remain constant and fixed costs per unit vary., B)    Fixed costs per unit remain constant and variable costs per unit vary., C)    Both total variable costs and total fixed costs vary., D)    Both total variable costs and total fixed costs remain constant.");
answers.add("A) Variable costs per unit remain constant and fixed costs per unit vary.");

questions.add(" Which answer can be defined as an investment center's contribution margin less the fixed costs that are traceable to the investment center?");
options.add("A) net income, B)    residual income, C)   segment margin, D)    return on investment (ROI)");
answers.add("C) segment margin");

questions.add(" If an auditor is expected to detect the overstatement of sales, what should the auditor trace transactions from?");
options.add("A) customer purchase orders to the sales journal, B)    cash receipts to the purchase orders, C)   sales journal to the shipping documents, D)    shipping documents to the cash receipts");
answers.add("C) sales journal to the shipping documents");

questions.add(" What is the formal method of analysis applied by management to identify appropriate cost drivers and effects on the costs of production?");
options.add("A) profitability analysis, B)    cost-benefit analysis, C)    life-cycle costing, D)   activity analysis");
answers.add("D) activity analysis");

questions.add(" When independent auditors can maintain their actual independence, it is referred to as independence in _____.");
options.add("A) fact, B)    Appearance, C)    totality, D)    trust");
answers.add("A) fact");

questions.add(" When applying a cost-volume-profit analysis (CVP), certain assumptions must be respected. Which answer is _not_ one of these assumptions?");
options.add("A) The unit sales price will remain constant., B)   Actual unit variable cost will vary over the production range., C)    The cost behavior is expressed as intersecting straight lines., D)    The unit fixed cost will decrease.");
answers.add("B) Actual unit variable cost will vary over the production range.");

questions.add(" Which statement about a perpetual inventory system is true?");
options.add("A) FIFO cost of goods sold will be the same as in a periodic inventory system., B)    Average costs are based entirely on unit cost simple averages., C)    LIFO cost of goods sold will be the same as in a periodic inventory system., D)   A new average is calculated under the average cost method after each sale.");
answers.add("D) A new average is calculated under the average cost method after each sale.");

questions.add(" Which type of business would be most likely to use a job order costing system?");
options.add("A) an electric car producer, B)    a wood milling company, C)    a beverage manufacturer, D)   a law firm specializing in injury law");
answers.add("D) a law firm specializing in injury law");

questions.add(" Assigning indirect costs to specific jobs is completed by ____.");
options.add("A) allocating to manufacturing overhead account, B)    using the manufacturing cost incurred, C)   applying a predetermined overhead rate, D)    applying indirect costs to work in the process");
answers.add("D) applying a predetermined overhead rate");

questions.add(" Which is an assurance engagement?");
options.add("A) compilation, B)    network installation, C)   audit, D)    review");
answers.add("C) audit");

questions.add(" What is a conversion cost the sum of?");
options.add("A) direct materials cost + administration cost, B)    direct materials cost + manufacturing overhead cost, C)    direct materials cost + marketing cost, D)   direct labor cost + manufacturing overhead cost");
answers.add("D) direct labor cost + manufacturing overhead cost");

questions.add(" Under a perpetual inventory system, merchandise is purchased on account. What is the correct journal entry for this purchase?");
options.add("A) Debit merchandise inventory. credit accounts payable., B)    Debit purchases credit cash., C)    Debit purchase returns credit cost of goods sold., D)   Debit merchandise inventory credit cash.");
answers.add("D) Debit merchandise inventory credit cash.");

questions.add(" Which is not a task usually associated with activity-based costing (ABC)?");
options.add("A) applying an activity rate for each cost pool, B)    identifying specific cost drivers, C)   appropriately allocating overhead costs to cost pools, D)    applying a single cost rate across processes");
answers.add("C) appropriately allocating overhead costs to cost pools");

questions.add(" What is true when the units in ending inventory increase during the year?");
options.add("A) Net income is higher for absorption costing than for variable costing., B)    Net income is identical for absorption costing and for variable costing., C)   There's no relationship between net income and the costing approach., D)    Net income is lower for absorption costing than for variable costing.");
answers.add("C) There's no relationship between net income and the costing approach.");

questions.add(" When independent auditors can maintain their actual independence, it is referred to as independence in _________ .");
options.add("A) trust, B)   totality, C)    Appearance, D)    fact");
answers.add("B) totality");
questions.add(" When do you expect to apply job costing over process costing?");
options.add("A) when the costs are easily traced to a specific product, B)    when costs are accumulated by the department, C)    when the value of work in process is based on assigning standard costs, D)    when each product batch is the same as the prior batch");
answers.add("A) when the costs are easily traced to a specific product");

questions.add(" Robinson Hotels is trying to predict its utility costs. It has five years of data, including monthly utility costs, monthly occupancy rates, and average monthly temperature. What tool or technique can Robinson Hotels use to predict or estimate its future utility costs?");
options.add("A) segment report, B)   regression analysis, C)    time series analysis, D)    net present value");
answers.add("B) regression analysis");

questions.add(" What does an inventory turnover ratio measure?");
options.add("A) the current value of the inventory, B)   the number of times inventory was sold during the period, C)    how it compares with the industry average, D)    whether the company can maintain the same inventory levels compared to industry averages");
answers.add("B) the number of times inventory was sold during the period");

questions.add(" The company earned a gross profit of $4,000,000 and had net sales of $12,000,000. What is the gross margin and what does the result imply to the reviewer?");
options.add("A) The 3.33% gross margin represents for every dollar in sales the company spends $0.9667 to produce the product sold., B)    The question does not provide sufficient information to offer a proper calculation., C)    The 3.33% gross margin represents for every dollar in sales the company spends $0.0667 to produce the product sold., D)    The 3.33% gross margin represents for every dollar in sales the company spends $0.0333 to produce the product sold.");
answers.add("A) The 3.33% gross margin represents for every dollar in sales the company spends $0.9667 to produce the product sold.");

questions.add(" What type of cost changes in proportion to a company's production volume?");
options.add("A) conversion cost, B)    indirect cost, C)   variable cost, D)    fixed cost");
answers.add("C) variable cost");

questions.add(" What do you call the benefit sacrificed when one option is chosen over another?");
options.add("A) opportunity cost, B)    indirect cost, C)    sunk cost, D)    differential cost");
answers.add("A) opportunity cost");

questions.add(" The actual price of a widget is $10 and the budgeted price is $7. What is the price variance for 1,000 widgets?");
options.add("A) $3000, B)    $1000, C)    $3, D)    $1700");
answers.add("A) $3000");

questions.add(" What is the major financial accounting report system used outside of the United States?");
options.add("A) the metric system, B)    TREE, C)    GAAP, D)   IFRS");
answers.add("D) IFRS");

questions.add(" What type of audit evidence would be considered the weakest type?");
options.add("A) oral evidence, B)    physical examination, C)    Confirmation, D)    documentary evidence");
answers.add("A) oral evidence");

questions.add(" Permanent accounts are on what financial statement?");
options.add("A) cash flow statement, B)    income statement, C)   balance sheet, D)    shareholder equity statement");
answers.add("C) balance sheet");

questions.add(" The cost of alternative X is $25,000 and the cost of alternative Y is $20,000. What do you call the $5,000 cost difference?");
options.add("A) essential cost, B)    additional cost, C)   differential cost, D)    sunk cost");
answers.add("C) differential cost");

questions.add(" What is the purpose of a master budget?");
options.add("A) to demonstrate to management the level of sales the company will achieve, B)    to provide shareholders and the board of directors confidence in management's abilities, C)    to allow management to compile all of the other operational budgets once they are completed, D)   to provide management with a high-level overview of the company finances and be a central planning tool");
answers.add("D) to provide management with a high-level overview of the company finances and be a central planning tool");

questions.add(" What is true about an internal control system?");
options.add("A) An internal control system is not effective until human error is eliminated or migrated., B)    Any internal control activities evaluated and adopted by a company should never be evaluated in terms of cost-benefit., C)    Only mid-to-large-sized companies and governmental organizations need to ensure proper internal control activities., D)   An internal control system helps a company achieve reliable financial reporting effective and efficient operations and compliance with laws and regulations.");
answers.add("D) An internal control system helps a company achieve reliable financial reporting effective and efficient operations and compliance with laws and regulations.");

questions.add(" According to the cost formula Y = $20,000 + $4x, what would be the total cost at an activity level of 15,000 units?");
options.add("A) $60000, B)    $20000, C)    $35000, D)   $80000");
answers.add("D) $80000");

questions.add(" A company can change to a new accounting principle if management can justify that the change will result in what?");
options.add("A) more relevant decision-making information, B)    lower net income to report for tax purposes, C)    changing depreciation methods for higher net income, D)    reduced potential for administrative error");
answers.add("A) more relevant decision-making information");

questions.add(" Which cost items would be classified as an internal failure cost on a quality costs report?");
options.add("A) cost of scrap, B)   training for assembly line workers, C)    patent cost for new product, D)    customer returns of defective products");
answers.add("B) training for assembly line workers");

questions.add(" What type of audit evidence would most likely be used to verify the existence of fixed assets?");
options.add("A) oral evidence, B)   physical examination, C)    Confirmation, D)    documentary evidence");
answers.add("B) physical examination");

questions.add(" What should an auditor do before auditing the balance sheet?");
options.add("A) Confirm whether probable legal action is disclosed to the auditor., B)    Investigate whether liens on assets are committed as collateral., C)    Determine the client's planned and imminent purchase commitments., D)   Gain a clear and proper understanding of the client's internal control processes.");
answers.add("D) Gain a clear and proper understanding of the client's internal control processes.");

questions.add(" At McKay Company, machine hours are limited. Due to limited machine hours,there is more demand for McKay's products than it can produce . To maximize profits, the company should evaluate each product's _______.");
options.add("A) contribution margin per unit, B)    segment margin per unit, C)    gross profit per unit, D)    contribution margin per machine hour");
answers.add("A) contribution margin per unit");

questions.add(" The asset-turnover ratio calculation measures _______.");
options.add("A) when the company must decide to purchase assets and what investment is required, B)    how much of a company's assets are financed by creditors, C)    how often a company must replace existing assets and equipment, D)   how efficiently a company uses its assets to generate revenue");
answers.add("D) how efficiently a company uses its assets to generate revenue");

questions.add(" What cost is easily traceable to a cost object?");
options.add("A) indirect, B)    fixed, C)    variable, D)   direct");
answers.add("D) direct");

questions.add(" Which value chain element is associated with the cost of staffing a customer support phone line?");
options.add("A) production and purchases, B)    distribution, C)    design, D)   customer service");
answers.add("D) customer service");

questions.add(" Flexible budgets are created to demonstrate how ___________.");
options.add("A) changes in activity levels affect predicted revenue and costs, B)    management needs to make changes to budget targets following poor performance, C)    an inaccurate operational budget results from poor budgeting data, D)    current results fully align with budgetary allocations");
answers.add("A) changes in activity levels affect predicted revenue and costs");

questions.add(" Which is the appropriate term for an incurred cost that cannot be changed by any decision?");
options.add("A) opportunity cost, B)    previous cost, C)   sunk cost, D)    variable cost");
answers.add("C) sunk cost");

questions.add(" Which factor is most likely to increase an auditor's awareness of possible fraudulent financial reporting?");
options.add("A) management's complete disclosure of unresolved legal action, B)    limited competition in the company's industry resulting in increasing profitability, C)    the audit committee's approval of specific accounting methods and principles, D)   year-end financial adjustments significantly impacting the financial results");
answers.add("D) year-end financial adjustments significantly impacting the financial results");

questions.add(" Which step of the accounting cycle involves checking to see if total debits equal total credits?");
options.add("A) normal balances on the ledgers, B)    closing entries, C)    post-closing trial balance, D)   preparation of the trial balance");
answers.add("D) preparation of the trial balance");
    }



    public static void main(String[] args) {
        new Accounting_Quiz(name).setVisible(true);
    }

}
