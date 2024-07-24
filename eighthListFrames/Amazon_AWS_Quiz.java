package eighthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Amazon_AWS_Quiz extends Quiz{
    

    public Amazon_AWS_Quiz(String name) {
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

    // questions :69
    @Override
    public final void loadQuestions() {
       
        
        questions.add("Which of the following is used to create a virtual machine in Azure?");
        options.add("A) Create VM, B) New VM, C) Deploy VM, D) Add VM");
        answers.add("A) Create VM");

        questions.add("How do you connect to an Azure SQL Database?");
        options.add("A) Using SQL Server Management Studio, B) Using FTP, C) Using SSH, D) Using RDP");
        answers.add("A) Using SQL Server Management Studio");

        questions.add("Which service is used for storing unstructured data in Azure?");
        options.add("A) Azure Blob Storage, B) Azure File Storage, C) Azure Disk Storage, D) Azure Queue Storage");
        answers.add("A) Azure Blob Storage");

        questions.add("What is the correct command to deploy a web app in Azure?");
        options.add("A) az webapp up, B) az appservice create, C) az app create, D) az web create");
        answers.add("A) az webapp up");

        questions.add("Which service is used for managing secrets in Azure?");
        options.add("A) Azure Key Vault, B) Azure Secrets Manager, C) Azure Secure Storage, D) Azure Credential Manager");
        answers.add("A) Azure Key Vault");

        questions.add("What is the Azure service for managing Kubernetes clusters?");
        options.add("A) AKS, B) AKM, C) AKE, D) AKC");
        answers.add("A) AKS");

        questions.add("Which service allows for continuous integration and delivery in Azure?");
        options.add("A) Azure DevOps, B) Azure Pipelines, C) Azure CI/CD, D) Azure Build");
        answers.add("A) Azure DevOps");

        questions.add("How do you create a resource group in Azure?");
        options.add("A) az group create, B) az resource create, C) az group new, D) az resource new");
        answers.add("A) az group create");

        questions.add("Which service is used for serverless computing in Azure?");
        options.add("A) Azure Functions, B) Azure App Services, C) Azure Logic Apps, D) Azure Automation");
        answers.add("A) Azure Functions");

        questions.add("What is the correct way to scale an app service plan in Azure?");
        options.add("A) az appservice plan scale, B) az app scale, C) az service scale, D) az scale appservice");
        answers.add("A) az appservice plan scale");

        questions.add("Which service is used for monitoring and diagnostics in Azure?");
        options.add("A) Azure Monitor, B) Azure Diagnostics, C) Azure Insights, D) Azure Tracker");
        answers.add("A) Azure Monitor");

        questions.add("How do you delete a resource group in Azure?");
        options.add("A) az group delete, B) az resource delete, C) az group remove, D) az resource remove");
        answers.add("A) az group delete");

        questions.add("Which Azure service is used for identity and access management?");
        options.add("A) Azure AD, B) Azure IAM, C) Azure Access, D) Azure ID");
        answers.add("A) Azure AD");

        questions.add("What is the command to list all virtual machines in a subscription?");
        options.add("A) az vm list, B) az vm show, C) az vm get, D) az vm display");
        answers.add("A) az vm list");

        questions.add("Which service provides a fully managed relational database in Azure?");
        options.add("A) Azure SQL Database, B) Azure DB, C) Azure Data Store, D) Azure SQL Server");
        answers.add("A) Azure SQL Database");

        questions.add("How do you create a storage account in Azure?");
        options.add("A) az storage account create, B) az storage create, C) az account create, D) az storage new");
        answers.add("A) az storage account create");

        questions.add("Which Azure service is used for hosting web applications?");
        options.add("A) Azure App Service, B) Azure Web Service, C) Azure Web Apps, D) Azure Site Service");
        answers.add("A) Azure App Service");

        questions.add("What is the correct command to create a virtual network in Azure?");
        options.add("A) az network vnet create, B) az vnet create, C) az network create, D) az net create");
        answers.add("A) az network vnet create");

        questions.add("Which service is used for data warehousing in Azure?");
        options.add("A) Azure Synapse Analytics, B) Azure Data Warehouse, C) Azure Data Lake, D) Azure Data Factory");
        answers.add("A) Azure Synapse Analytics");

        questions.add("How do you create a SQL database in an existing SQL server in Azure?");
        options.add("A) az sql db create, B) az sql create, C) az db create, D) az database create");
        answers.add("A) az sql db create");
        
        questions.add("Which of the following is used to create an EC2 instance in AWS?");
        options.add("A) Launch Instance, B) New Instance, C) Deploy Instance, D) Create Instance");
        answers.add("A) Launch Instance");

        questions.add("How do you connect to an EC2 instance?");
        options.add("A) Using SSH, B) Using FTP, C) Using RDP, D) Using Telnet");
        answers.add("A) Using SSH");

        questions.add("Which service is used for storing objects in AWS?");
        options.add("A) Amazon S3, B) Amazon EFS, C) Amazon RDS, D) Amazon EBS");
        answers.add("A) Amazon S3");

        questions.add("What is the correct command to deploy a Lambda function in AWS?");
        options.add("A) aws lambda create-function, B) aws lambda deploy, C) aws lambda launch, D) aws lambda upload");
        answers.add("A) aws lambda create-function");

        questions.add("Which service is used for managing secrets in AWS?");
        options.add("A) AWS Secrets Manager, B) AWS Key Management Service, C) AWS Vault, D) AWS Secure Store");
        answers.add("A) AWS Secrets Manager");

        questions.add("What is the AWS service for managing Kubernetes clusters?");
        options.add("A) Amazon EKS, B) Amazon ECS, C) Amazon AKS, D) Amazon Kube");
        answers.add("A) Amazon EKS");

        questions.add("Which service allows for continuous integration and delivery in AWS?");
        options.add("A) AWS CodePipeline, B) AWS CodeBuild, C) AWS CI/CD, D) AWS DevOps");
        answers.add("A) AWS CodePipeline");

        questions.add("How do you create a security group in AWS?");
        options.add("A) aws ec2 create-security-group, B) aws ec2 new-security-group, C) aws ec2 add-security-group, D) aws ec2 deploy-security-group");
        answers.add("A) aws ec2 create-security-group");

        questions.add("Which service is used for serverless computing in AWS?");
        options.add("A) AWS Lambda, B) AWS App Runner, C) AWS Fargate, D) AWS Cloud Functions");
        answers.add("A) AWS Lambda");

        questions.add("What is the correct way to scale an EC2 instance in AWS?");
        options.add("A) aws ec2 modify-instance-attribute, B) aws ec2 resize-instance, C) aws ec2 scale-instance, D) aws ec2 change-instance-type");
        answers.add("A) aws ec2 modify-instance-attribute");

        questions.add("Which service is used for monitoring and diagnostics in AWS?");
        options.add("A) Amazon CloudWatch, B) Amazon CloudTrail, C) Amazon Inspector, D) Amazon Monitor");
        answers.add("A) Amazon CloudWatch");

        questions.add("How do you delete an S3 bucket in AWS?");
        options.add("A) aws s3 rb, B) aws s3 delete-bucket, C) aws s3 remove-bucket, D) aws s3 clear-bucket");
        answers.add("A) aws s3 rb");

        questions.add("Which AWS service is used for identity and access management?");
        options.add("A) AWS IAM, B) AWS Directory Service, C) AWS Access Manager, D) AWS ID Manager");
        answers.add("A) AWS IAM");

        questions.add("What is the command to list all EC2 instances in a region?");
        options.add("A) aws ec2 describe-instances, B) aws ec2 list-instances, C) aws ec2 get-instances, D) aws ec2 show-instances");
        answers.add("A) aws ec2 describe-instances");

        questions.add("Which service provides a fully managed relational database in AWS?");
        options.add("A) Amazon RDS, B) Amazon DB, C) Amazon Aurora, D) Amazon SQL");
        answers.add("A) Amazon RDS");

        questions.add("How do you create an S3 bucket in AWS?");
        options.add("A) aws s3 mb, B) aws s3 create-bucket, C) aws s3 new-bucket, D) aws s3 add-bucket");
        answers.add("A) aws s3 mb");

        questions.add("Which AWS service is used for hosting web applications?");
        options.add("A) AWS Elastic Beanstalk, B) AWS App Runner, C) AWS Lightsail, D) AWS Web Hosting");
        answers.add("A) AWS Elastic Beanstalk");

        questions.add("What is the correct command to create a VPC in AWS?");
        options.add("A) aws ec2 create-vpc, B) aws ec2 new-vpc, C) aws ec2 add-vpc, D) aws ec2 deploy-vpc");
        answers.add("A) aws ec2 create-vpc");

        questions.add("Which service is used for data warehousing in AWS?");
        options.add("A) Amazon Redshift, B) Amazon Data Warehouse, C) Amazon Aurora, D) Amazon Data Lake");
        answers.add("A) Amazon Redshift");

        questions.add("How do you create a database in Amazon RDS?");
        options.add("A) aws rds create-db-instance, B) aws rds create-database, C) aws rds new-db-instance, D) aws rds add-database");
        answers.add("A) aws rds create-db-instance");

        questions.add("Which AWS service is used for running containers?");
        options.add("A) Amazon ECS, B) Amazon EKS, C) Amazon Fargate, D) Amazon Container Service");
        answers.add("A) Amazon ECS");

        questions.add("What is the command to stop an EC2 instance in AWS?");
        options.add("A) aws ec2 stop-instances, B) aws ec2 halt-instances, C) aws ec2 shutdown-instances, D) aws ec2 end-instances");
        answers.add("A) aws ec2 stop-instances");

        questions.add("Which service is used for load balancing in AWS?");
        options.add("A) Elastic Load Balancer, B) AWS Load Manager, C) AWS Traffic Manager, D) Amazon Balancer");
        answers.add("A) Elastic Load Balancer");

        questions.add("How do you delete a VPC in AWS?");
        options.add("A) aws ec2 delete-vpc, B) aws ec2 remove-vpc, C) aws ec2 drop-vpc, D) aws ec2 clear-vpc");
        answers.add("A) aws ec2 delete-vpc");

        questions.add("Which service is used for API management in AWS?");
        options.add("A) Amazon API Gateway, B) AWS API Management, C) Amazon API Service, D) AWS API Proxy");
        answers.add("A) Amazon API Gateway");

        questions.add("What is the command to restart an EC2 instance in AWS?");
        options.add("A) aws ec2 reboot-instances, B) aws ec2 restart-instances, C) aws ec2 reset-instances, D) aws ec2 start-instances");
        answers.add("A) aws ec2 reboot-instances");

        questions.add("Which Azure service is used for running containers?");
        options.add("A) Azure Container Instances, B) Azure Container Service, C) Azure Kubernetes Service, D) Azure Container Registry");
        answers.add("A) Azure Container Instances");

        questions.add("What is the command to stop a virtual machine in Azure?");
        options.add("A) az vm stop, B) az vm halt, C) az vm shutdown, D) az vm end");
        answers.add("A) az vm stop");

        questions.add("Which service is used for load balancing in Azure?");
        options.add("A) Azure Load Balancer, B) Azure Traffic Manager, C) Azure Balancer, D) Azure Load Manager");
        answers.add("A) Azure Load Balancer");

        questions.add("How do you delete a virtual network in Azure?");
        options.add("A) az network vnet delete, B) az vnet delete, C) az network delete, D) az net delete");
        answers.add("A) az network vnet delete");

        questions.add("Which service is used for API management in Azure?");
        options.add("A) Azure API Management, B) Azure API Gateway, C) Azure API Service, D) Azure API Proxy");
        answers.add("A) Azure API Management");

        questions.add("What is the command to restart a virtual machine in Azure?");
        options.add("A) az vm restart, B) az vm reboot, C) az vm reset, D) az vm start");
        answers.add("A) az vm restart");

        questions.add("Which Azure service is used for big data processing?");
        options.add("A) Azure HDInsight, B) Azure Data Lake, C) Azure Big Data, D) Azure Data Factory");
        answers.add("A) Azure HDInsight");

        questions.add("How do you list all resource groups in a subscription?");
        options.add("A) az group list, B) az resource list, C) az group show, D) az resource show");
        answers.add("A) az group list");

        questions.add("Which service is used for CDN in Azure?");
        options.add("A) Azure CDN, B) Azure Content Delivery, C) Azure Cache, D) Azure Edge");
        answers.add("A) Azure CDN");

        questions.add("What is the correct command to create a firewall rule in Azure SQL Database?");
        options.add("A) az sql server firewall-rule create, B) az sql firewall create, C) az sql firewall-rule create, D) az sql server firewall create");
        answers.add("A) az sql server firewall-rule create");

        questions.add("Which service is used for backup in Azure?");
        options.add("A) Azure Backup, B) Azure Recovery, C) Azure Save, D) Azure Storage Backup");
        answers.add("A) Azure Backup");

        questions.add("How do you scale a virtual machine in Azure?");
        options.add("A) az vm resize, B) az vm scale, C) az vm change-size, D) az vm modify");
        answers.add("A) az vm resize");

        questions.add("Which service is used for IoT in Azure?");
        options.add("A) Azure IoT Hub, B) Azure IoT Central, C) Azure IoT Suite, D) Azure IoT Core");
        answers.add("A) Azure IoT Hub");

        questions.add("What is the command to create a new Azure Function app?");
        options.add("A) az functionapp create, B) az function create, C) az appservice create, D) az funcapp create");
        answers.add("A) az functionapp create");

        questions.add("Which Azure service is used for orchestrating workflows?");
        options.add("A) Azure Logic Apps, B) Azure Workflow, C) Azure Orchestration, D) Azure Automation");
        answers.add("A) Azure Logic Apps");

        questions.add("How do you create a new Azure Logic App?");
        options.add("A) az logicapp create, B) az logic create, C) az workflow create, D) az app create");
        answers.add("A) az logicapp create");

        questions.add("Which service is used for DNS management in Azure?");
        options.add("A) Azure DNS, B) Azure Name Service, C) Azure Domain Service, D) Azure DNS Manager");
        answers.add("A) Azure DNS");

        questions.add("What is the correct command to create an Azure App Service plan?");
        options.add("A) az appservice plan create, B) az appservice create, C) az service plan create, D) az app plan create");
        answers.add("A) az appservice plan create");

        questions.add("Which Azure service is used for caching?");
        options.add("A) Azure Cache for Redis, B) Azure Cache Service, C) Azure Redis Cache, D) Azure Caching");
        answers.add("A) Azure Cache for Redis");

        questions.add("How do you start a virtual machine in Azure?");
        options.add("A) az vm start, B) az vm poweron, C) az vm run, D) az vm boot");
        answers.add("A) az vm start");
        
        questions.add("Which AWS service is used for big data processing?");
        options.add("A) Amazon EMR, B) AWS Data Lake, C) Amazon Redshift, D) AWS Data Pipeline");
        answers.add("A) Amazon EMR");

        questions.add("How do you list all S3 buckets in a region?");
        options.add("A) aws s3 ls, B) aws s3 list-buckets, C) aws s3 show-buckets, D) aws s3 get-buckets");
        answers.add("A) aws s3 ls");

        questions.add("Which service is used for CDN in AWS?");
        options.add("A) Amazon CloudFront, B) AWS Content Delivery, C) AWS Cache, D) AWS Edge");
        answers.add("A) Amazon CloudFront");

  }
    

    
    public static void main(String[]args){
        new Amazon_AWS_Quiz(name).setVisible(true);
    }
}

