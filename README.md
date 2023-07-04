# Spring Boot CI\CD

This is "Hello World" template for automating the build & deployment process of Spring boot 2 application.
Jenkins jobs log files are streamed and persisted.

Technologies being used:
* Maven
* Jenkins ( using pipeline plugin )
* Ansible
* Spring Boot 2
* Filebeat
* ELK
* Docker & Docker-compose
* Nexus

## Usage
### Running Jenknis on Docker
```bash
$ cd src/main/docker/
# build the containers and fire them up
$ ./run_services.sh
```
### Executing ansible playbooks
* Make sure you you have a proper ssh connection to your target hosts listed in `inventory.ini` and you disabled sudo password.
* For now the paths in `playbooks` are hardcoded so change it according to your control machine.
```bash
$ cd src/main/scripts
$ ansible-playbook springboot-playbook.yml -i inventory.ini -u ubuntu
```

## Resources

* [Spring Initializr](https://start.spring.io/)
* [Dockerizing Jenkins](https://dzone.com/articles/dockerizing-jenkins-2-setup-and-using-it-along-wit)
* [Jenkins ansible plugin](https://start.spring.io/)
* [Step by step ansible guide](https://blog.ssdnodes.com/blog/step-by-step-ansible-guide/)
* [Spring boot deployment docs](https://docs.spring.io/spring-boot/docs/current/reference/html/deployment-install.html)
* [CI-CD with jenkins and ansible](https://itnext.io/ci-cd-with-jenkins-and-ansible-f41ef2b33977)
* [integrating-ansible-jenkins-cicd-process](https://www.redhat.com/en/blog/integrating-ansible-jenkins-cicd-process)
* [Ansible spring-boot remyma role](https://github.com/remyma/ansible-springboot)
* [Ansible Maven_artifact module](https://docs.ansible.com/ansible/latest/modules/maven_artifact_module.html)
* [ec2_instance_facts](https://docs.ansible.com/ansible/2.4/ec2_instance_facts_module.html)
* [Generating ssh keys](https://www.ssh.com/ssh/keygen/)
* [Disable sudo password](https://askubuntu.com/questions/147241/execute-sudo-without-password)
* [Jacoco - hello-world](https://mkyong.com/maven/maven-jacoco-code-coverage-example/)
* [Jacoco - Jenkins plugin](https://dzone.com/articles/jacoco-jenkins-plugin)
