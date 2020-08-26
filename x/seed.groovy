base_path = "finaltask1"
folder("${base_path}")
job_path = "${base_path}/y"

pipelineJob(job_path) {
    description("This job creates a jumphost to access jenkins agents run in Openstack VMs")
    logRotator {
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace("${job_path}/Jenkinsfile"))
            sandbox(false)
        }
    }
}
