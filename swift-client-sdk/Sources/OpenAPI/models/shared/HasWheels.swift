// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public enum HasWheels {
        case car(Shared.Car)
        case bike(Shared.Bike)
    }}

extension Shared.HasWheels: Codable {
    enum DiscriminatorKey: CodingKey {
        case wheelsType
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: DiscriminatorKey.self)
        let discriminator = try container.decode(String.self, forKey: .wheelsType)

        switch discriminator {
        case "four":
            let value = try Shared.Car(from: decoder)
            self = .car(value)
        case "two":
            let value = try Shared.Bike(from: decoder)
            self = .bike(value)
        default:
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .car(let value):
            try value.encode(to: encoder)
        case .bike(let value):
            try value.encode(to: encoder)
        }
    }
}
