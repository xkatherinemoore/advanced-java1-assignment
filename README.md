# How to get started:
### Method 1 - Starting from Scratch:
1. Inside of an Eclipse Workspace, create a new Java project and call it whatever you want
2. Press finish and inside of src create 2 new folders labeled 'data' and 'userValidator'
3. Inside of the data folder, insert the txt file available on the titus assignment page or create a new text file and add the user info at the bottom of this Readme
4. Inside the userValidator folder, make a new class called 'UserDataValidator'
5. Either make sure to click the checkbox that adds a main method or write your own
6. Start your assignment

### Method 2 - Clone from Github:
1. Open the Git perspective: In Eclipse, select "Window" -> "Perspective" -> "Open Perspective" -> "Other...". Choose "Git" from the list and click "OK".
2. Clone the repository: Click on the "Clone a Git repository" icon in the Git perspective toolbar.
3. Provide the clone URL: Paste the clone URL of the GitHub project into the "URI" field in the "Clone Git Repository" dialog.
4. Authenticate (if required): Enter your GitHub credentials if prompted.
5. Configure the local destination: Choose a directory for the project's local copy.
6. Select branch or tag (optional): Choose a specific branch or leave it as the default.
7. Import the project: On the "Import Projects" screen, select the repository and click "Next".
8. Choose project import options: Select the project(s) you want to import and customize import options as needed. Click "Finish".
9. Wait for the import process: Eclipse will import the project(s) and display progress in the "Progress" view.
10. Open the imported project(s): The project(s) will be available in the Package Explorer or Project Explorer view in Eclipse.
11. Start your assignment
<br/>
<br/>
<br/>

# The Assignment: 
We are going to make a project that uses File I/O and Exception Handling in Java to read through some user data and ensure that we only save properly formatted responses. You have been given access to some data where each row is formatted in the following way: `Name, Email, Age`. However, some of the rows are missing information or have impossible values (e.g. negative ages). Your finished project will be able to separate the 'good' responses from the 'bad' into their respective files! Here are the steps you can take to get there:

1. 	Instantiate 3 separate objects: a 'reader' that reads the
    data inside user_data.txt, a 'validWriter' for
    writing to a file with all the valid data,
    and an errorWriter for writing to a file with all the faulty data. You can name the files that these writers write to anything you want but make it clear which file stores what.
    - If this try block fails, it would have to be because of an error from
    instantiating these readers (e.g. file not found, I/O exception, etc.), so
    just print the error to the console

2. 	Inside that try block, run a while loop that iterates through each line of the file. If you make use of the BufferedReader object to read in your file, there is a .readline() method that may of great use. 
    - Here's some great documentation of how you may approach this: [Link to Documentaiton](https://www.baeldung.com/java-buffered-reader#2-reading-line-by-line)

3. In another try / catch block (inside the while loop), do the following:
    1. Use the .split() method on the current line to split the line by each comma so we can get an array of the name, email, and age of each user
    2. If the length of the array is different than 3, we know something is wrong
    so throw an exception with message "Missing Data"
    3. Save each piece of data in the array to its own variable, making sure to
    trim them of whitespace with .trim() and casting them to the correct datatypes
    (Email + Name are strings, Age is int)
    4. If age is less than or equal to 0, throw an exception with message
    "Invalid Age"
    5. In the case that the line passed all of these checks, write the line with the
    validWriter!
    6. In the catch block, write the faulty line with the errorWriter appended
    with the error message!
4. After the last catch statement, use a finally statement to close out of all of your readers and writers with the .close() method. This will require another try/catch block due to potential I/O errors ;)
5. **Congratulations!** If you made it this far, you have a working user data filterer!

<br/>
<br/>

## User Data:
```
John Smith, john.smith@yahoo.com, 35
emily.johnson@yahoo.com, 28
Michael Davis, michael.davis@yahoo.com, -42
Sarah Wilson, sarah.wilson@yahoo.com, 31
Christopher Thompson, christopher.thompson@yahoo.com, 39
Jessica Anderson, jessica.anderson@yahoo.com, 24
David Martinez, 37
Jennifer Taylor, jennifer.taylor@yahoo.com, 33
Robert Garcia, robert.garcia@gmail.com, 45
Linda Hernandez, linda.hernandez@gmail.com, 29
Matthew Brown, matthew.brown@gmail.com, 36
Amanda Miller, amanda.miller@gmail.com, 27
Andrew Wilson, andrew.wilson@gmail.com, 41
Laura Davis, laura.davis@gmail.com, 32
Daniel Johnson, daniel.johnson@gmail.com, 38
Olivia Smith, olivia.smith@gmail.com, -26
Ryan Thompson, ryan.thompson@gmail.com, 43
Sophia Anderson, sophia.anderson@gmail.com, 23
Jacob Martinez, jacob.martinez@gmail.com, 34
Grace Taylor, grace.taylor@gmail.com, 30
William Garcia, william.garcia@gmail.com, 44
Victoria Hernandez, victoria.hernandez@gmail.com, 25
Ethan Brown, ethan.brown@gmail.com, 40
Natalie Miller, natalie.miller@gmail.com, 31
Benjamin Wilson, benjamin.wilson@yahoo.com, 35
abigail.davis@yahoo.com, -29
James Johnson, james.johnson@yahoo.com, 42
Elizabeth Smith, elizabeth.smith@yahoo.com, 28
Alexander Thompson, alexander.thompson@yahoo.com, 39
Samantha Anderson, samantha.anderson@yahoo.com, 24
```