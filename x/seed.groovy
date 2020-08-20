base_path = "finaltask"
job_path = "${base_path}/x"

pipelineJob(job_path) {
    description("This job creates a jumphost to access jenkins agents run in Openstack VMs")
    logRotator {
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace("${job_path}/jenkinsfile.groovy"))
            sandbox(false)
        }
    }
}
