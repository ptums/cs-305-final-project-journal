### Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial develops customized financial plans for its customers, covering savings, retirement, investments, insurance, and more. Given that the company possesses data on their clients' financial information, protecting this information is paramount. Therefore, all data communicated over their API services must be highly secure and monitored at all times.

Our company was hired to ensure that their software application adheres to software security best practices. These practices include maintaining up-to-date Maven dependencies with minimal vulnerabilities, encrypting the data used in the application with a cipher algorithm such as SHA-256, using server certificates to establish trustworthy connections with the client, implementing comprehensive error handling, and overall, meeting the criteria outlined in the Vulnerability Assessment Process Flow Diagram.

### What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I have experience in writing quality code that is not only readable but also integrates fundamental error-handing practices. Thus, when tasked with refining the code—by eliminating any compromising database details found in comments and enhancing data processing with robust error handling—I found these adjustments to be intuitively aligned with my skills. It's crucial to code securely because developers, despite their expertise, can make errors.

They may inadvertently commit database information to the repository, fail to terminate processes with catch blocks, among various other pitfalls due to lack of experience or when distractions lead to a lapse in attention to detail. I believe the significance of software security in enhancing a company's overall wellbeing is multifaceted: not only does it ensure the company can trust the software with the processing of clients' private information, but it also extends to trusting the engineers who maintain the software. By adhering to the best practices in coding security, the company can depend on its engineers to promptly identify vulnerabilities and investigate attacks efficiently and effectively.

### What part of the vulnerability assessment was challenging or helpful to you?

One of the most challenging aspects of vulnerability assessment is interpreting the results. Often, the description of each vulnerability is loaded with acronyms, version numbers, and supporting details, necessitating additional research beyond the report. It's common to discover that a package vulnerability may not even be relevant to your project, or that the vulnerability is very niche and might not be exploitable. Utilizing the suppression.xml file to hide unnecessary vulnerabilities generated in the report can narrow down the details, enabling you to address vulnerabilities that will have a critical impact on the software.

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

Learning how to use the suppression.xml file was very helpful in assessing vulnerabilities and deciding which mitigation technique to use. I found that running the dependency checker with the file removes unnecessary/irrelevant vulnerabilities from the report. I would increase the layers of security by updating the vulnerable packages to the latest version and then running the report again. If the vulnerability of a package is reduced but still has some significant issues, I would analyze each individual package and find the solution to solve its vulnerability.

One thing to note is that between each report run, I would perform a smoke test of the software to ensure that updating or adding any packages does not create issues with the software's functionality. Once I completed several rounds of updates to the package dependencies, I would focus my efforts on installing a server certificate for APIs in the software so that the communication with the client is encrypted and trustworthy. I think a combination of ensuring all your dependencies are free from vulnerabilities and ensuring your API communications are secure is a good way to layer the security of the software. There are more layers we can add, but these two are the most basic/foundational layers.

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

The approach I took to ensure the code and software application were functional and secure involved carefully examining each line of the codebase. If I discovered anything insecure or of poor quality, I would make a note of it and then assess how that particular line of code affects other aspects of the program. Understanding how vulnerable lines of code impact other parts allowed me to grasp the program as a whole from a holistic perspective.

Before making any changes, I would run a dependency check report and record the number of vulnerabilities. After making my adjustments, I tested from a client perspective to see if my changes resolved the issue at hand. If the code refactoring successfully addressed the issue, I would run the report again to ensure my changes did not introduce any new problems. This process was tedious and involved a lot of trial and error, but ultimately, it proved to be the best method for fixing issues with the code without introducing new ones.

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Refactoring the code to incorporate try/catch blocks, along with proper error alerting, is a coding practice I believe will be beneficial for future assignments and tasks. When I was a beginner programmer, I perceived error messages as negative indicators. I thought that encountering an error meant one was not proficient in coding.

<img width="495" alt="Screenshot 2024-03-02 at 7 58 10 AM" src="https://github.com/ptums/cs-305-final-project-journal/assets/4443722/fbc61a49-5ccf-4dc8-b141-6913c13911e5">

However, after gaining years of experience, my perspective has shifted. I now view errors as valuable guides in understanding the limitations of the software. They serve as excellent indicators of what is not functioning correctly in the code and provide a solid starting point for devising a solution.

### Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
