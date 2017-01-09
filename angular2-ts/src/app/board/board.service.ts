import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {Board} from "./Board";

import 'rxjs/add/operator/toPromise';

@Injectable()
export class BoardService {
    private api_get_boardlist = 'http://localhost:8080/api/getBoardList';

    constructor(private http: Http) {}

    getBoardList(): Promise<Board[]> {
        return this.http.get(this.api_get_boardlist)
            .toPromise()
            .then(response => {
                console.log(response.json());
                return response.json() as Board[];
            })
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
    }
}
