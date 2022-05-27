package com.divyaa.apidocumentation.rest;

import com.divyaa.apidocumentation.rest.model.Response;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Divyaa P
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "The request was successful 200",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "201",
                description = "The request was successful 201",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "400",
                description = "Bad request 400",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "401",
                description = "Unauthorized 401",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "403",
                description = "The request was refused 402",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "404",
                description = "The request was not found 404",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "405",
                description = "The request is not allowed 405",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "406",
                description = "Could not find acceptable representation 406",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "408",
                description = "Request timeout 408",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "500",
                description = "Server error 500",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "502",
                description = "The request resulted in an error 502",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        ),
        @ApiResponse(
                responseCode = "503",
                description = "The request resulted in a recoverable error 503. Please try your request again",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = Response.class)
                        )
                }
        )
})
public @interface ApiDocumentation {

}
