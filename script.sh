#!/bin/bash
set -xe
sudo apt-get update
sudo apt-get -y install ansible
sudo apt-get -y install git
git clone https://github.com/SupriyaMutyala/finaltask.git
cd finaltask; sudo ansible-playbook kubernates.yml
