package www.sanju.tourism.Model

class Moments {
    var title: String? = null
    var description: String? = null
    var image: String? = null
    var timestamp: String? = null

    constructor() {}
    constructor(
        title: String?,
        description: String?,
        image: String?,
        timestamp: String?
    ) {
        this.title = title
        this.description = description
        this.image = image
        this.timestamp = timestamp
    }

}