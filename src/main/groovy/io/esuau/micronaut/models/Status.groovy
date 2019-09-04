package io.esuau.micronaut.models

class Status implements Serializable {

    private String name

    private String version

    private String state

    Status(String name, String version, String state) {
        this.name = name
        this.version = version
        this.state = state
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getVersion() {
        return version
    }

    void setVersion(String version) {
        this.version = version
    }

    String getState() {
        return state
    }

    void setState(String state) {
        this.state = state
    }

}
