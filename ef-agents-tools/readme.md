 
 ```
 docker build -t shbali/ef-tools:latest .
 docker run -v "${PWD}":/work:ro -v ~/.ansible/roles:/root/.ansible/roles -v ~/.ssh:/root/.ssh:ro --rm shbali/ef-tools:latest ansible-playbook playbook.yml