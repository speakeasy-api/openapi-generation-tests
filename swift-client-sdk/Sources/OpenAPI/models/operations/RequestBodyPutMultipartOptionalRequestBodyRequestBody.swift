// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct RequestBodyPutMultipartOptionalRequestBodyRequestBody: APIValue {
        public let sampleField: String?
        public let sampleFile: Operations.SampleFile?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(sampleField: String? = nil, sampleFile: Operations.SampleFile? = nil) {
            self.sampleField = sampleField
            self.sampleFile = sampleFile
        }
    }
}