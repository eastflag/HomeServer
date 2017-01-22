import {Injectable} from "@angular/core";
import {Http, Headers} from "@angular/http";
import {Board} from "./Board";

import 'rxjs/add/operator/toPromise';

@Injectable()
export class BoardService {
    private api_get_boardlist = 'http://localhost:8080/api/getBoardList';
    private api_get_board = 'http://localhost:8080/api/getBoard?board_id=';
    private api_post_addboard = 'http://localhost:8080/api/addBoard';

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

    getBoard(board_id: number): Promise<Board> {
        return this.http.get(this.api_get_board + board_id)
            .toPromise()
            .then(response => {
                console.log(response.json());
                return response.json() as Board;
            })
            .catch(this.handleError);
    }

    addBoard(board: Board): Promise<Board> {
        let headers = new Headers({
            'Content-Type': 'application/json'
        });

        return this.http.post(this.api_post_addboard, JSON.stringify(board), {headers: headers})
            .toPromise()
            .then(response => {
                console.log(response.json());
                return response.json();
            })
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
    }
}
