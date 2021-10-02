package lesson004f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task05_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Enter number of HTTP Error (400, 401, 403, ... 413, 4xx): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int statusCode = Integer.parseInt(br.readLine());
		
		if ((statusCode < 400) || (statusCode > 499)) {
			System.out.print("Try again: ");
			br.readLine();
		} else {

			switch (statusCode) {
			case 400:
				System.out.println(
						"BadRequest. \nBad Request indicates that the request could not be understood by the server. BadRequest is sent when no other error is applicable, or if the exact error is unknown or does not have its own error code.");
				break;

			case 401:
				System.out.println(
						"Unauthorized. \nUnauthorized indicates that the requested resource requires authentication. The WWW-Authenticate header contains the details of how to perform the authentication.");
				break;

			case 403:
				System.out.println("Forbidden.\nForbidden indicates that the server refuses to fulfill the request.");
				break;

			case 404:
				System.out.println(
						"NotFound. \nNot Found indicates that the requested resource does not exist on the server.");
				break;

			case 405:
				System.out.println(
						"MethodNotAllowed. \nIs returned as 501. Not Implemented indicates that the server does not support the requested function.");
				break;

			case 408:
				System.out.println(
						"RequestTimeout. \nIs returned as 503. Service Unavailable indicates that the server is temporarily unavailable, usually due to high load or maintenance.");
				break;

			case 409:
				System.out.println(
						"Conflict. \nConflict indicates that the request could not be carried out because of a conflict on the server.");
				break;

			case 410:
				System.out.println("Gone. \nGone indicates that the requested resource is no longer available.");
				break;

			case 412:
				System.out.println(
						"PreconditionFailed. \nPrecondition Failed indicates that a condition set for this request failed, and the request cannot be carried out. Conditions are set with conditional request headers like If-Match, If-None-Match, or If-Unmodified-Since.");
				break;

			case 413:
				System.out.println(
						"RequestEntityTooLarge. \nRequest Entity TooLarge indicates that the request is too large for the server to process..");
				break;

			default:
				System.out.println("NotFound. \nAny other HTTP 4xx codes are returned as error 404.");
				break;
			}
		}
	}
}
