package io.esuau.micronaut.models

class Status implements Serializable {

    private String name

    private String version

    private String message

    Status(String name, String version, String message) {
        this.name = name
        this.version = version
        this.message = message
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

    String getMessage() {
        return message
    }

    void setMessage(String message) {
        this.message = message
    }

}
