// swift-tools-version: 5.6
import PackageDescription

let package = Package(
    name: "OpenAPI",
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: "OpenAPI",
            targets: ["OpenAPI"]
        )
    ],
    dependencies: [],
    targets: [
        .target(
            name: "OpenAPI",
            dependencies: []
        ),
        .testTarget(
            name: "OpenAPITests",
            dependencies: ["OpenAPI"]
        )
  ]
)
