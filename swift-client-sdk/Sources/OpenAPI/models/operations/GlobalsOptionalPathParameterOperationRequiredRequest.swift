// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct GlobalsOptionalPathParameterOperationRequiredRequest: APIValue {
        /// Overrides the optional global path parameter to be required at the
        /// operation level.
        /// 
        public let globalOptionalPathParam: String?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter globalOptionalPathParam: Overrides the optional global path parameter to be required at the
        /// operation level.
        /// 
        ///
        public init(globalOptionalPathParam: String? = nil) {
            self.globalOptionalPathParam = globalOptionalPathParam
        }
    }}