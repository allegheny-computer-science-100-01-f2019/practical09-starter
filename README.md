# cs100f2019-practical9-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter materials for Practical 9 in Computer Science 100-01.

Since the Travis builds for this repository will initially fail (as evidenced by
a red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
programmer is responsible for completing all of the steps needed to satisfy the
requirements for the assignment, thus causing a &#x2714; to instead appear in
the commit logs.

This assignment requires a programmer to study and extend existing Java programs,
that will produce textual output. Please see the comments in the source code
and the laboratory assignment sheet for more details. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`Practical9.java`, `Octopus.java` and `Utensil.java` files must adhere to all
of the requirements in the [Google Java Style
Guide](https://google.github.io/styleguide/javaguide.html).

The Java programs must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader).
Specifically, GatorGrader will check the following characteristics of your
implementation:

* The `Practical9` program must:
  * Contain at least five single-line comments and two multi-line comments
  * Call the constructor for the `Date` class
  * Call the constructor for the `Octopus` class
  * Call the constructor for the `Utensil` class
  * Call the `println` method at least twelve times to produce the desired output

The source code in the `Octopus` file must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader).
Specifically, GatorGrader will check the following characteristics of your
implementation:

* The `Octopus` program must:
  * Contain at least five single-line comments and ten multi-line comments
  * Never call the `println` method
  * Declare or use the constructor and methods correctly

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet all of the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides.

To do well on this assignment, you should also review Chapters 1 through 4.
Finally, please read Sections 5.1 through 5.3 to learn more about conditional
logic constructs. Please see the course instructor or one of the
technical leaders if you have questions about any of these reading
assignments.

## System Commands

This project invites students to enter system commands into a terminal window.
This assignment uses [Docker](https://www.docker.com) to deliver programs, such
as `gradle` and the source code and packages needed to run
[GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students'
computer, thereby eliminating the need for a programmer to install them on their
development workstation. Individuals who do not want or can not install Docker can
optionally install of the programs mentioned in the [Project
Requirements](#requirements) section of this document. Once all the required
programs are installed locally on a machine, a software developer can type the
various `gradle` commands directly in the terminal.

### Using Docker

Once you have installed [Docker
Desktop](https://www.docker.com/products/docker-desktop), you can use the
following `docker run` command to start `gradle grade` as a containerized
application, using the [DockaGator](https://github.com/GatorEducator/dockagator)
Docker image available on
[DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code and technical writing of this assignment, as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment. To ensure that the previous command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`. If the above `docker run` command does not work correctly on
the Windows operating system, you may need to instead run the following command
to work around limitations in the terminal window:

```bash
docker run --rm --name dockagator \
  -v "$(pwd):/project" \
  -v "$HOME/.dockagator:/root/.local/share" \
  gatoreducator/dockagator
```

Since the above `docker run` command uses a Docker images that, by default, runs
`gradle grade` and then exits the Docker container, you may want to instead run
the following command so that you enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by
typing the command `gradle grade` in your terminal. Running this command will
produce a lot of output that you should carefully inspect. If GatorGrader's
output shows that there are no mistakes in the assignment, then your source code
and writing are passing all of the automated baseline checks. However, if the
output indicates that there are mistakes, then you will need to understand what
they are and then try to fix them.

Here are some additional commands that you may need to run when using Docker:

* `docker info`: display information about how Docker runs on your workstation
* `docker images`: show the Docker images installed on your workstation
* `docker container list`: list the active images running on your workstation
* `docker container stop containerID`: stops the active container with the specified ID
* `docker system prune`: remove many types of "dangling" components from your workstation
* `docker image prune`: remove all "dangling" docker images from your workstation
* `docker container prune`: remove all stopped docker containers from your workstation
* `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

You can complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is correct) the program using the command `gradle
build`. Running the command `gradle -q --console plain run` will suppress the display of
Gradle's diagnostic information and only produce output of the program.
Here are some other commands that you can type:

* `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base")
directory for this assignment where the `build.gradle` file is located.

## Output

Your program should adhere to all of the requirements for the assignment and
pass all of the verification checks, and also produce textual output similar
but not identical to the following:

```
> Task :run
Janyl Jumadinova
Thu Oct 31 15:44:22 EDT 2019

Testing 'get' methods:
Ocky weighs 100.0 pounds
and is 15 years old. His favorite utensil is a green spatula
Ocky's green spatula costs $10.59
Utensil's color: green

Testing 'get' methods on the new Octopus and Utensil objects:
Mocky weighs 200.0 pounds
and is 5 years old. His favorite utensil is a red fork
Mocky's red fork costs $4.26
Utensil's color: red

Testing 'set' methods:
Ocky's new age: 20
Ocky's new weight: 125.0
Utensil's new cost: $15.99
Utensil's new color: blue

Testing 'set' methods on the new Octopus and Utensil objects :
Mocky's new age: 35
Mocky's new weight: 200.0
Mocky's utensil's new cost: $7.99
Mocky's utensil's new color: yellow
```

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100 Practical 9
Starter](https://github.com/allegheny-computer-science-100-01-f2019/practical09-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the
[GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a technical leader during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
